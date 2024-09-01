package books;

import dbConnection.dbConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Book {

    Connection con = dbConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement statement;
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select max(bookid) from book");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;
    }

    public int getMaxUser() {
        int id = 0;
        Statement statement;
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select max(id) from user");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;
    }

    public void insert(int bookid, String bookname, String author, String category, String page_num, String link, String price) {
        String sql = "insert into book (bookid, bookname, author, category, page_num, link, price) values (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookid);
            ps.setString(2, bookname);
            ps.setString(3, author);
            ps.setString(4, category);
            ps.setString(5, page_num);
            ps.setString(6, link);
            ps.setString(7, price);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New book added successfully.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertUser(int id, String username, String email, String password) {
        String sql = "insert into user (id, username, email, password) values (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, password);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "User added successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred while trying to add the user.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertToCart(int bookid) {
        String sql = "INSERT INTO cart (id, title, writer, category, pages, downlink, cost) "
                + "SELECT bookid, bookname, author, category, page_num, link, price "
                + "FROM book "
                + "WHERE bookid = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookid);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Book added to the cart successfully.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deneme(JTextField tf) {
        if (!tf.getText().isEmpty()) {
            int bookid = Integer.parseInt(tf.getText());
            insertToCart(bookid);
        } else {
            JOptionPane.showMessageDialog(null, "Select a book to add your cart.");
        }
    }

    public boolean isBookExist(String bookname) {
        try {
            ps = con.prepareStatement("select * from book where bookname = ?");
            ps.setString(1, bookname);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isUserExist(String email) { //REGISTRATION ICIN
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean isUidExist(int id) { //REGISTRATION ICIN
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String getUsername(String email) {
        String username = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT username FROM user WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                username = rs.getString("username");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username;
    }

    public String getAdminUsername(String email) {
        String username = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT username FROM admin WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                username = rs.getString("username");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username;
    }

    public boolean userCheckLogin(String email, String password) {
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean adminCheckLogin(String email, String password) {
        try {
            ps = con.prepareStatement("SELECT * FROM admin WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void insertUser(String username, String email, String password) {
        String sql = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "User registered successfully.");
                JOptionPane.showMessageDialog(null, "Redirecting to login page.");
            } else {
                JOptionPane.showMessageDialog(null, "Error while registering user.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error while registering user: " + ex.getMessage());
        }
    }

    public boolean isIDexist(int id) {
        try {
            ps = con.prepareStatement("select * from book where bookid = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isIDexist_user(int id) {
        try {
            ps = con.prepareStatement("select * from user where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isIDexistCart(int id) {
        try {
            ps = con.prepareStatement("select * from cart where bookid = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void getCartValues(JTable table, String searchValue) {
        String sql = "SELECT * FROM cart WHERE CONCAT(id, '|', title, '|', writer, '|', category) LIKE ? ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                int bookid = rs.getInt(1);
                String bookname = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String pageNum = rs.getString(5);
                String link = rs.getString(6);
                String price = rs.getString(7);

                Object[] row = {bookid, bookname, author, category, pageNum, link, price};
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getBookValues(JTable table, String searchValue) {
        String sql = "SELECT * FROM book WHERE CONCAT(bookid, '|', bookname, '|', author, '|', category) LIKE ? ORDER BY bookid";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                int bookid = rs.getInt(1);
                String bookname = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String pageNum = rs.getString(5);
                String link = rs.getString(6);
                String price = rs.getString(7);
                Object[] row = {bookid, bookname, author, category, pageNum, link, price};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getUserValues(JTable table, String searchValue) {
        String sql = "SELECT * FROM user WHERE CONCAT(id, '|', username, '|', email, '|', password) LIKE ? ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String email = rs.getString(3);
                String password = rs.getString(4);
                Object[] row = {id, username, email, password};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sortByTitle(JTable table) {
        String sql = "SELECT * FROM book ORDER BY bookname";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                int bookid = rs.getInt("bookid");
                String bookname = rs.getString("bookname");
                String author = rs.getString("author");
                String category = rs.getString("category");
                String pageNum = rs.getString("page_num");
                String link = rs.getString("link");

                Object[] row = {bookid, bookname, author, category, pageNum, link};
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sortByAuthor(JTable table) {
        String sql = "SELECT * FROM book ORDER BY author";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                int bookid = rs.getInt("bookid");
                String bookname = rs.getString("bookname");
                String author = rs.getString("author");
                String category = rs.getString("category");
                String pageNum = rs.getString("page_num");
                String link = rs.getString("link");
                Object[] row = {bookid, bookname, author, category, pageNum, link};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int bookid, String bookname, String author, String category, String page_num, String link, String price) {
        String sql = "update book set bookname = ?, author = ?, category = ?, page_num = ?, link = ?, price = ? where bookid = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bookname);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.setString(4, page_num);
            ps.setString(5, link);
            ps.setString(6, price);
            ps.setInt(7, bookid);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Book data updated successfully.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateUser(String username, String email, String password, int id) {
        String sql = "UPDATE user SET username = ?, email = ?, password = ? WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setInt(4, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "User data updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "User data couldn't be updated successfully.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int bookid) {
        int yesOrNo = JOptionPane.showConfirmDialog(null, "This book will be deleted.", "Book Deletion", JOptionPane.OK_OPTION);
        if (yesOrNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete  from book where bookid = ?");
                ps.setInt(1, bookid);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book deletion is successful.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deleteAll() {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM cart");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete_user(int id) {
        int yesOrNo = JOptionPane.showConfirmDialog(null, "This user will be deleted.", "User Deletion", JOptionPane.OK_OPTION);
        if (yesOrNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete from user where id = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "User deletion is successful.");
                } else {
                    JOptionPane.showMessageDialog(null, "An error occurred while trying to delete the user.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int calculateTotalPrice(JTable table, int priceColumnIndex) {
        int total = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int row = 0; row < model.getRowCount(); row++) {
            int price = Integer.parseInt(model.getValueAt(row, priceColumnIndex).toString());
            total += price;
        }
        return total;
    }

    public void deleteCart(int bookid) {
        int yesOrNo = JOptionPane.showConfirmDialog(null, "This book will be deleted.", "Book Deletion", JOptionPane.OK_OPTION);
        if (yesOrNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete from cart where id = ?");
                ps.setInt(1, bookid);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book deletion is successful.");
                } else {
                    JOptionPane.showMessageDialog(null, "An error occurred whilst deleting the book.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
