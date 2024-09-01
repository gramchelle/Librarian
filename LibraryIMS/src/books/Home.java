package books;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    Book book = new Book();
    int xx, xy;
    private DefaultTableModel model;
    private int rowIndex;

    public Home() {
        setIconImage(new ImageIcon(getClass().getResource("/books/resources/bookmark.png")).getImage());
        setTitle("Library Information Management System");
        LogPage logPage = new LogPage();
        logPage.setVisible(false);
        setVisible(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        generalPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        adminPanel = new javax.swing.JPanel();
        detailsPanel = new javax.swing.JPanel();
        adminTitleField = new javax.swing.JTextField();
        detailsLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminAuthorField = new javax.swing.JTextField();
        adminPagesField = new javax.swing.JTextField();
        adminISBNField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminLinkField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adminAddButton = new javax.swing.JButton();
        adminDeleteButton = new javax.swing.JButton();
        adminRetrieveButton = new javax.swing.JButton();
        adminUpdateButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        adminComboBox = new javax.swing.JComboBox<>();
        adminLogOutButton = new javax.swing.JButton();
        adminClearButton = new javax.swing.JButton();
        priceField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        adminBook = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        UserPanel = new javax.swing.JPanel();
        detailsPanel1 = new javax.swing.JPanel();
        userTitleField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userAuthorField = new javax.swing.JTextField();
        userPagesField = new javax.swing.JTextField();
        userISBNField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        userLinkField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        userSearchField = new javax.swing.JTextField();
        sortByTitleButton = new javax.swing.JButton();
        userComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        userRefreshButton = new javax.swing.JButton();
        userLogOutButton = new javax.swing.JButton();
        userSearchButton = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();
        receiptButton = new javax.swing.JButton();
        goToCart = new javax.swing.JButton();
        receiptButton1 = new javax.swing.JButton();
        sortByAuthor = new javax.swing.JButton();
        detailsLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        adminBook1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        goBackButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        detailsPanel2 = new javax.swing.JPanel();
        cart1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cart2 = new javax.swing.JTextField();
        cart3 = new javax.swing.JTextField();
        cartField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        userLinkField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cartbox = new javax.swing.JComboBox<>();
        detailsLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        userLinkField2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        deleteButton2 = new javax.swing.JButton();
        butTextField2 = new javax.swing.JTextField();
        deleteButton3 = new javax.swing.JButton();
        deleteButton4 = new javax.swing.JButton();
        adminBook2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        uDetails = new javax.swing.JTable();
        detailsPanel3 = new javax.swing.JPanel();
        detailsLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        uid2 = new javax.swing.JTextField();
        uid3 = new javax.swing.JTextField();
        uid1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        uid4 = new javax.swing.JTextField();
        adminAddButton1 = new javax.swing.JButton();
        adminDeleteButton1 = new javax.swing.JButton();
        adminRetrieveButton1 = new javax.swing.JButton();
        adminUpdateButton1 = new javax.swing.JButton();
        adminLogOutButton1 = new javax.swing.JButton();
        adminClearButton1 = new javax.swing.JButton();
        adminRetrieveButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        adminBook3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        generalPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 43)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(101, 44, 122));
        jLabel1.setText("Librarian.com - Contemporary Library Information Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane.setBackground(new java.awt.Color(107, 107, 222));

        adminPanel.setBackground(new java.awt.Color(153, 153, 255));

        detailsPanel.setBackground(new java.awt.Color(102, 153, 255));
        detailsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        adminTitleField.setBackground(new java.awt.Color(255, 255, 255));
        adminTitleField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminTitleField.setForeground(new java.awt.Color(0, 0, 0));
        adminTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTitleFieldActionPerformed(evt);
            }
        });

        detailsLabel.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        detailsLabel.setForeground(new java.awt.Color(102, 102, 255));
        detailsLabel.setText("Book Details");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Title");

        adminAuthorField.setBackground(new java.awt.Color(255, 255, 255));
        adminAuthorField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminAuthorField.setForeground(new java.awt.Color(0, 0, 0));
        adminAuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAuthorFieldActionPerformed(evt);
            }
        });

        adminPagesField.setBackground(new java.awt.Color(255, 255, 255));
        adminPagesField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminPagesField.setForeground(new java.awt.Color(0, 0, 0));
        adminPagesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPagesFieldActionPerformed(evt);
            }
        });
        adminPagesField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminPagesFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adminPagesFieldKeyTyped(evt);
            }
        });

        adminISBNField.setBackground(new java.awt.Color(204, 204, 204));
        adminISBNField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminISBNField.setForeground(new java.awt.Color(0, 0, 0));
        adminISBNField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminISBNFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adminISBNFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Category");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Pages");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ID");

        adminLinkField.setBackground(new java.awt.Color(255, 255, 255));
        adminLinkField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminLinkField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Download");

        adminAddButton.setBackground(new java.awt.Color(102, 102, 255));
        adminAddButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminAddButton.setForeground(new java.awt.Color(51, 51, 51));
        adminAddButton.setText("Add a Book");
        adminAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminAddButtonMouseClicked(evt);
            }
        });
        adminAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddButtonActionPerformed(evt);
            }
        });

        adminDeleteButton.setBackground(new java.awt.Color(102, 102, 255));
        adminDeleteButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminDeleteButton.setForeground(new java.awt.Color(51, 51, 51));
        adminDeleteButton.setText("Delete the Book");
        adminDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteButtonActionPerformed(evt);
            }
        });

        adminRetrieveButton.setBackground(new java.awt.Color(102, 102, 255));
        adminRetrieveButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminRetrieveButton.setForeground(new java.awt.Color(51, 51, 51));
        adminRetrieveButton.setText("Retrieve Books");
        adminRetrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRetrieveButtonActionPerformed(evt);
            }
        });

        adminUpdateButton.setBackground(new java.awt.Color(102, 102, 255));
        adminUpdateButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminUpdateButton.setForeground(new java.awt.Color(51, 51, 51));
        adminUpdateButton.setText("Update the Book");
        adminUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUpdateButtonActionPerformed(evt);
            }
        });

        adminComboBox.setBackground(new java.awt.Color(255, 255, 255));
        adminComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        adminComboBox.setForeground(new java.awt.Color(0, 0, 0));
        adminComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-fiction", "Mystery/Thriller", "Romance", "Science Fiction/Fantasy", "Biography/Autobiography", "History", "Self-help/Personal Development", "Business/Economics", "Travel", "Cookbooks", "Art/Photography", "Religion/Spirituality", "Science/Nature", "Children's Books", "Young Adult", "Graphic Novels/Comics", "Poetry", "Health/Fitness", "Technology/Computers" }));
        adminComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminComboBoxActionPerformed(evt);
            }
        });

        adminLogOutButton.setBackground(new java.awt.Color(102, 102, 255));
        adminLogOutButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminLogOutButton.setForeground(new java.awt.Color(51, 51, 51));
        adminLogOutButton.setText("Log Out");
        adminLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogOutButtonActionPerformed(evt);
            }
        });

        adminClearButton.setBackground(new java.awt.Color(102, 102, 255));
        adminClearButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminClearButton.setForeground(new java.awt.Color(51, 51, 51));
        adminClearButton.setText("Clear");
        adminClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminClearButtonMouseClicked(evt);
            }
        });
        adminClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminClearButtonActionPerformed(evt);
            }
        });

        priceField.setBackground(new java.awt.Color(255, 255, 255));
        priceField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        priceField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Price");

        adminBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/resources/admin.png"))); // NOI18N

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(detailsPanelLayout.createSequentialGroup()
                                        .addComponent(adminClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                        .addComponent(adminUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminRetrieveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(adminAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adminDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminLinkField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminPagesField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(adminAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminBook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detailsLabel)
                                .addGap(48, 48, 48)))))
                .addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(47, 47, 47))
                            .addComponent(adminBook, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLinkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRetrieveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        adminTable.setBackground(new java.awt.Color(102, 102, 255));
        adminTable.setForeground(new java.awt.Color(0, 0, 0));
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"
            }
        ));
        adminTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminTable);
        if (adminTable.getColumnModel().getColumnCount() > 0) {
            adminTable.getColumnModel().getColumn(0).setResizable(false);
            adminTable.getColumnModel().getColumn(1).setResizable(false);
            adminTable.getColumnModel().getColumn(2).setResizable(false);
            adminTable.getColumnModel().getColumn(3).setResizable(false);
            adminTable.getColumnModel().getColumn(4).setResizable(false);
            adminTable.getColumnModel().getColumn(5).setResizable(false);
            adminTable.getColumnModel().getColumn(6).setResizable(false);
            adminTable.getColumnModel().getColumn(6).setHeaderValue("Price");
        }

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Admin - Book", adminPanel);

        UserPanel.setBackground(new java.awt.Color(153, 153, 255));

        detailsPanel1.setBackground(new java.awt.Color(102, 153, 255));
        detailsPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        userTitleField.setBackground(new java.awt.Color(255, 255, 255));
        userTitleField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userTitleField.setForeground(new java.awt.Color(0, 0, 0));
        userTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTitleFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Title");

        userAuthorField.setBackground(new java.awt.Color(255, 255, 255));
        userAuthorField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userAuthorField.setForeground(new java.awt.Color(0, 0, 0));

        userPagesField.setBackground(new java.awt.Color(255, 255, 255));
        userPagesField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userPagesField.setForeground(new java.awt.Color(0, 0, 0));

        userISBNField.setBackground(new java.awt.Color(255, 255, 255));
        userISBNField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userISBNField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Author");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Category");

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Pages");

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("ISBN / ID");

        userLinkField.setBackground(new java.awt.Color(255, 255, 255));
        userLinkField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userLinkField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Download");

        userSearchField.setBackground(new java.awt.Color(255, 255, 255));
        userSearchField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userSearchField.setForeground(new java.awt.Color(0, 0, 0));

        sortByTitleButton.setBackground(new java.awt.Color(102, 102, 255));
        sortByTitleButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        sortByTitleButton.setForeground(new java.awt.Color(51, 51, 51));
        sortByTitleButton.setText("Sort By Title");
        sortByTitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByTitleButtonActionPerformed(evt);
            }
        });

        userComboBox.setBackground(new java.awt.Color(255, 255, 255));
        userComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        userComboBox.setForeground(new java.awt.Color(0, 0, 0));
        userComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-fiction", "Mystery/Thriller", "Romance", "Science Fiction/Fantasy", "Biography/Autobiography", "History", "Self-help/Personal Development", "Business/Economics", "Travel", "Cookbooks", "Art/Photography", "Religion/Spirituality", "Science/Nature", "Children's Books", "Young Adult", "Graphic Novels/Comics", "Poetry", "Health/Fitness", "Technology/Computers" }));
        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

        userRefreshButton.setBackground(new java.awt.Color(102, 102, 255));
        userRefreshButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        userRefreshButton.setForeground(new java.awt.Color(51, 51, 51));
        userRefreshButton.setText("Refresh");
        userRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRefreshButtonActionPerformed(evt);
            }
        });

        userLogOutButton.setBackground(new java.awt.Color(102, 102, 255));
        userLogOutButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        userLogOutButton.setForeground(new java.awt.Color(51, 51, 51));
        userLogOutButton.setText("Log Out");
        userLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLogOutButtonActionPerformed(evt);
            }
        });

        userSearchButton.setBackground(new java.awt.Color(102, 102, 255));
        userSearchButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        userSearchButton.setForeground(new java.awt.Color(51, 51, 51));
        userSearchButton.setText("Search");
        userSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSearchButtonActionPerformed(evt);
            }
        });

        addToCart.setBackground(new java.awt.Color(102, 102, 255));
        addToCart.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        addToCart.setForeground(new java.awt.Color(51, 51, 51));
        addToCart.setText("Add to Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        receiptButton.setBackground(new java.awt.Color(102, 102, 255));
        receiptButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        receiptButton.setForeground(new java.awt.Color(51, 51, 51));
        receiptButton.setText("Go to Site");
        receiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptButtonActionPerformed(evt);
            }
        });

        goToCart.setBackground(new java.awt.Color(102, 102, 255));
        goToCart.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        goToCart.setForeground(new java.awt.Color(51, 51, 51));
        goToCart.setText("Go to Cart");
        goToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToCartActionPerformed(evt);
            }
        });

        receiptButton1.setBackground(new java.awt.Color(102, 102, 255));
        receiptButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        receiptButton1.setForeground(new java.awt.Color(51, 51, 51));
        receiptButton1.setText("Clear");
        receiptButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptButton1ActionPerformed(evt);
            }
        });

        sortByAuthor.setBackground(new java.awt.Color(102, 102, 255));
        sortByAuthor.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        sortByAuthor.setForeground(new java.awt.Color(51, 51, 51));
        sortByAuthor.setText("Sort By Author");
        sortByAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByAuthorActionPerformed(evt);
            }
        });

        detailsLabel2.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        detailsLabel2.setForeground(new java.awt.Color(102, 102, 255));
        detailsLabel2.setText("Book Details");

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Price");

        adminBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/resources/user.png"))); // NOI18N

        javax.swing.GroupLayout detailsPanel1Layout = new javax.swing.GroupLayout(detailsPanel1);
        detailsPanel1.setLayout(detailsPanel1Layout);
        detailsPanel1Layout.setHorizontalGroup(
            detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel1Layout.createSequentialGroup()
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(userAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(receiptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(userSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(sortByTitleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sortByAuthor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userRefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(userPagesField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(userISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userLinkField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(adminBook1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailsLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        detailsPanel1Layout.setVerticalGroup(
            detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel1Layout.createSequentialGroup()
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailsLabel2)
                            .addComponent(adminBook1))
                        .addGap(18, 18, 18)))
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLinkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiptButton1)
                    .addComponent(userRefreshButton))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(goToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortByTitleButton)
                    .addComponent(userLogOutButton)
                    .addComponent(sortByAuthor))
                .addContainerGap())
        );

        userTable.setBackground(new java.awt.Color(102, 102, 255));
        userTable.setForeground(new java.awt.Color(0, 0, 0));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
            userTable.getColumnModel().getColumn(4).setResizable(false);
            userTable.getColumnModel().getColumn(5).setResizable(false);
            userTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(detailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("User", UserPanel);

        cartPanel.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        goBackButton.setBackground(new java.awt.Color(102, 102, 255));
        goBackButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(51, 51, 51));
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 102, 255));
        deleteButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        buyButton.setBackground(new java.awt.Color(102, 102, 255));
        buyButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        buyButton.setForeground(new java.awt.Color(51, 51, 51));
        buyButton.setText("Confirm");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        detailsPanel2.setBackground(new java.awt.Color(102, 153, 255));
        detailsPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        cart1.setBackground(new java.awt.Color(255, 255, 255));
        cart1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cart1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Title");

        cart2.setBackground(new java.awt.Color(255, 255, 255));
        cart2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cart2.setForeground(new java.awt.Color(0, 0, 0));

        cart3.setBackground(new java.awt.Color(255, 255, 255));
        cart3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cart3.setForeground(new java.awt.Color(0, 0, 0));

        cartField.setBackground(new java.awt.Color(255, 255, 255));
        cartField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cartField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Author");

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Category");

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Pages");

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("ISBN / ID");

        userLinkField1.setBackground(new java.awt.Color(255, 255, 255));
        userLinkField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userLinkField1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Download");

        cartbox.setBackground(new java.awt.Color(255, 255, 255));
        cartbox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cartbox.setForeground(new java.awt.Color(0, 0, 0));
        cartbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-fiction", "Mystery/Thriller", "Romance", "Science Fiction/Fantasy", "Biography/Autobiography", "History", "Self-help/Personal Development", "Business/Economics", "Travel", "Cookbooks", "Art/Photography", "Religion/Spirituality", "Science/Nature", "Children's Books", "Young Adult", "Graphic Novels/Comics", "Poetry", "Health/Fitness", "Technology/Computers" }));
        cartbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartboxActionPerformed(evt);
            }
        });

        detailsLabel4.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        detailsLabel4.setForeground(new java.awt.Color(102, 102, 255));
        detailsLabel4.setText("Cart Details");

        userLinkField2.setBackground(new java.awt.Color(255, 255, 255));
        userLinkField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userLinkField2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Price");

        javax.swing.GroupLayout detailsPanel2Layout = new javax.swing.GroupLayout(detailsPanel2);
        detailsPanel2.setLayout(detailsPanel2Layout);
        detailsPanel2Layout.setHorizontalGroup(
            detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(detailsPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(detailsLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(detailsPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cartbox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cart3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cartField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cart2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLinkField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLinkField2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        detailsPanel2Layout.setVerticalGroup(
            detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addContainerGap(467, Short.MAX_VALUE))
                    .addGroup(detailsPanel2Layout.createSequentialGroup()
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel25)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel2Layout.createSequentialGroup()
                                .addComponent(detailsLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLinkField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLinkField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(161, 161, 161))))
        );

        deleteButton2.setBackground(new java.awt.Color(102, 102, 255));
        deleteButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        deleteButton2.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton2.setText("Retrieve Basket");
        deleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton2ActionPerformed(evt);
            }
        });

        butTextField2.setEditable(false);
        butTextField2.setBackground(new java.awt.Color(255, 255, 255));
        butTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        butTextField2.setForeground(new java.awt.Color(0, 0, 0));

        deleteButton3.setBackground(new java.awt.Color(102, 102, 255));
        deleteButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        deleteButton3.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton3.setText("Clear");
        deleteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton3ActionPerformed(evt);
            }
        });

        deleteButton4.setBackground(new java.awt.Color(102, 102, 255));
        deleteButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        deleteButton4.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton4.setText("Calculate Total");
        deleteButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton4ActionPerformed(evt);
            }
        });

        adminBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/resources/cart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(butTextField2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(adminBook2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(detailsPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(adminBook2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyButton)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(detailsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );

        cartTable.setBackground(new java.awt.Color(102, 102, 255));
        cartTable.setForeground(new java.awt.Color(0, 0, 0));
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(cartTable);

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Cart", cartPanel);

        jPanel5.setBackground(new java.awt.Color(158, 158, 251));

        uDetails.setBackground(new java.awt.Color(102, 102, 255));
        uDetails.setForeground(new java.awt.Color(0, 0, 0));
        uDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Email", "Password"
            }
        ));
        uDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uDetailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(uDetails);

        detailsPanel3.setBackground(new java.awt.Color(102, 153, 255));
        detailsPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        detailsLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        detailsLabel1.setForeground(new java.awt.Color(102, 102, 255));
        detailsLabel1.setText("User Details");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("ID");

        uid2.setBackground(new java.awt.Color(255, 255, 255));
        uid2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        uid2.setForeground(new java.awt.Color(0, 0, 0));

        uid3.setBackground(new java.awt.Color(255, 255, 255));
        uid3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        uid3.setForeground(new java.awt.Color(0, 0, 0));
        uid3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uid3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uid3KeyTyped(evt);
            }
        });

        uid1.setBackground(new java.awt.Color(204, 204, 204));
        uid1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        uid1.setForeground(new java.awt.Color(0, 0, 0));
        uid1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uid1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uid1KeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Username");

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Email");

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Password");

        uid4.setBackground(new java.awt.Color(255, 255, 255));
        uid4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        uid4.setForeground(new java.awt.Color(0, 0, 0));

        adminAddButton1.setBackground(new java.awt.Color(102, 102, 255));
        adminAddButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminAddButton1.setForeground(new java.awt.Color(51, 51, 51));
        adminAddButton1.setText("Add a User");
        adminAddButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminAddButton1MouseClicked(evt);
            }
        });
        adminAddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddButton1ActionPerformed(evt);
            }
        });

        adminDeleteButton1.setBackground(new java.awt.Color(102, 102, 255));
        adminDeleteButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminDeleteButton1.setForeground(new java.awt.Color(51, 51, 51));
        adminDeleteButton1.setText("Delete the User");
        adminDeleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteButton1ActionPerformed(evt);
            }
        });

        adminRetrieveButton1.setBackground(new java.awt.Color(102, 102, 255));
        adminRetrieveButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminRetrieveButton1.setForeground(new java.awt.Color(51, 51, 51));
        adminRetrieveButton1.setText("Retrieve Users");
        adminRetrieveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRetrieveButton1ActionPerformed(evt);
            }
        });

        adminUpdateButton1.setBackground(new java.awt.Color(102, 102, 255));
        adminUpdateButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminUpdateButton1.setForeground(new java.awt.Color(51, 51, 51));
        adminUpdateButton1.setText("Update the User");
        adminUpdateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUpdateButton1ActionPerformed(evt);
            }
        });

        adminLogOutButton1.setBackground(new java.awt.Color(102, 102, 255));
        adminLogOutButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminLogOutButton1.setForeground(new java.awt.Color(51, 51, 51));
        adminLogOutButton1.setText("Log Out");
        adminLogOutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogOutButton1ActionPerformed(evt);
            }
        });

        adminClearButton1.setBackground(new java.awt.Color(102, 102, 255));
        adminClearButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminClearButton1.setForeground(new java.awt.Color(51, 51, 51));
        adminClearButton1.setText("Search the User");
        adminClearButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminClearButton1MouseClicked(evt);
            }
        });
        adminClearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminClearButton1ActionPerformed(evt);
            }
        });

        adminRetrieveButton2.setBackground(new java.awt.Color(102, 102, 255));
        adminRetrieveButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        adminRetrieveButton2.setForeground(new java.awt.Color(51, 51, 51));
        adminRetrieveButton2.setText("Clear");
        adminRetrieveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRetrieveButton2ActionPerformed(evt);
            }
        });

        adminBook3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/resources/user2.png"))); // NOI18N

        javax.swing.GroupLayout detailsPanel3Layout = new javax.swing.GroupLayout(detailsPanel3);
        detailsPanel3.setLayout(detailsPanel3Layout);
        detailsPanel3Layout.setHorizontalGroup(
            detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(adminRetrieveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(detailsPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanel3Layout.createSequentialGroup()
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uid1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel3Layout.createSequentialGroup()
                                .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminDeleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminRetrieveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminAddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminLogOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminUpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(detailsPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uid4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uid3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uid2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(detailsPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(76, 284, Short.MAX_VALUE))
                            .addGroup(detailsPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(detailsLabel1)
                                .addGap(64, 64, 64))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel3Layout.createSequentialGroup()
                        .addComponent(adminBook3)
                        .addGap(284, 284, 284))))
        );
        detailsPanel3Layout.setVerticalGroup(
            detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanel3Layout.createSequentialGroup()
                        .addComponent(adminBook3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detailsPanel3Layout.createSequentialGroup()
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailsLabel1)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(37, 37, 37)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(42, 42, 42)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(39, 39, 39)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uid4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(34, 34, 34)
                        .addComponent(adminRetrieveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminAddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminRetrieveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminDeleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminUpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminLogOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Admin - User", jPanel4);

        javax.swing.GroupLayout generalPanelLayout = new javax.swing.GroupLayout(generalPanel);
        generalPanel.setLayout(generalPanelLayout);
        generalPanelLayout.setHorizontalGroup(
            generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabbedPane))
                .addContainerGap())
        );
        generalPanelLayout.setVerticalGroup(
            generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void hideAdminTab() {
        tabbedPane.remove(0);
    }

    public void hideAdminTab2() {
        tabbedPane.remove(2);
    }

    public void clearAdmin(JTextField a, JTextField b, JTextField c, JTextField d) {
        a.setText(null);
        b.setText(null);
        c.setText(null);
        d.setText(null);
    }

    public void hideUsersTab1() {
        tabbedPane.remove(2);
    }

    public void hideUsersTab2() {
        tabbedPane.remove(1);
    }

    public void init() {
        tableViewBook();
        adminTitleField.setText(String.valueOf(book.getMax()));
    }

    private void clearAdmin(JTextField a, JTextField b, JTextField c, JTextField d, JTextField e, JTextField g, JComboBox f) {
        a.setText(null);
        b.setText(null);
        c.setText(null);
        d.setText(null);
        e.setText(null);
        f.setSelectedIndex(0);
        g.setText(null);
    }

    private void tableViewBook() {
        model = (DefaultTableModel) userTable.getModel();
        userTable.setRowHeight(55);
        userTable.setShowGrid(true);
        userTable.setGridColor(Color.black);
        userTable.setBackground(Color.white);
    }

    private boolean isEmptyBook() {
        if (adminTitleField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Title is missing");
            return false;
        }
        if (adminAuthorField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Author is missing");
            return false;
        }
        if (adminPagesField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Page Numbers is missing");
            return false;
        }
        if (adminISBNField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ISBN is missing");
            return false;
        }
        if (adminLinkField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Download Link is missing");
            return false;
        }
        return true;
    }

    private boolean isEmptyAdmin() {
        if (uid1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID is missing");
            return false;
        }
        if (uid2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is missing");
            return false;
        }
        if (uid3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email Numbers is missing");
            return false;
        }
        if (uid4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is missing");
            return false;
        }
        return true;
    }

    private boolean isEmptyUser() {
        if (uid1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID is missing");
            return false;
        }
        if (uid2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is missing");
            return false;
        }
        if (uid3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email is missing");
            return false;
        }
        if (uid4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is missing");
            return false;
        }
        return true;
    }

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void sortByAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByAuthorActionPerformed
        userTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link"}));
        book.sortByAuthor(userTable);
    }//GEN-LAST:event_sortByAuthorActionPerformed

    private void receiptButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptButton1ActionPerformed
        userISBNField.setText(null);
        userTitleField.setText(null);
        userAuthorField.setText(null);
        userComboBox.setSelectedIndex(0);
        userPagesField.setText(null);
        userLinkField.setText(null);
        price.setText(null);
        userSearchField.setText(null);
    }//GEN-LAST:event_receiptButton1ActionPerformed

    private void goToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToCartActionPerformed
        tabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_goToCartActionPerformed

    private void receiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptButtonActionPerformed
        String link = userLinkField.getText();
        int a = JOptionPane.showConfirmDialog(this, "Do you want to go to the site now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            if (!userLinkField.getText().isEmpty()) {
                try {
                    Desktop.getDesktop().browse(new URI(link));
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a book.");
            }
        }
    }//GEN-LAST:event_receiptButtonActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        book.deneme(userISBNField);
    }

    public void addToBuyTable(Object[] rowData, JTable buyTable) {
        DefaultTableModel buyModel = (DefaultTableModel) buyTable.getModel();
        buyModel.addRow(rowData);
    }//GEN-LAST:event_addToCartActionPerformed

    private void userSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSearchButtonActionPerformed
        if (userSearchField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a value to search on.");
        } else {
            userTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link"}));
            book.getBookValues(userTable, userSearchField.getText());
        }
    }//GEN-LAST:event_userSearchButtonActionPerformed

    private void userLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLogOutButtonActionPerformed
        int b = JOptionPane.showConfirmDialog(this, "Do you want to log out now? Changes on your cart won't be saved.", "Select", JOptionPane.YES_NO_OPTION);
        if (b == 0) {
            book.deleteAll();
            LogPage logPage = new LogPage();
            logPage.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_userLogOutButtonActionPerformed

    private void userRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRefreshButtonActionPerformed
        userTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"}));
        book.getBookValues(userTable, "");
        userSearchField.setText(null);
    }//GEN-LAST:event_userRefreshButtonActionPerformed

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userComboBoxActionPerformed

    private void sortByTitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByTitleButtonActionPerformed
        userTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link"}));
        book.sortByTitle(userTable);
    }//GEN-LAST:event_sortByTitleButtonActionPerformed

    private void adminTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTableMouseClicked
        model = (DefaultTableModel) adminTable.getModel();
        rowIndex = adminTable.getSelectedRow();
        adminISBNField.setText(model.getValueAt(rowIndex, 0).toString());
        adminTitleField.setText(model.getValueAt(rowIndex, 1).toString());
        adminAuthorField.setText(model.getValueAt(rowIndex, 2).toString());
        String category = model.getValueAt(rowIndex, 3).toString();
        if (category.equals("Fiction")) {
            adminComboBox.setSelectedIndex(0);
        } else if (category.equals("Non-fiction")) {
            adminComboBox.setSelectedIndex(1);
        } else if (category.equals("Mystery/Thriller")) {
            adminComboBox.setSelectedIndex(2);
        } else if (category.equals("Romance")) {
            adminComboBox.setSelectedIndex(3);
        } else if (category.equals("Science Fiction/Fantasy")) {
            adminComboBox.setSelectedIndex(4);
        } else if (category.equals("Biography/Autobiography")) {
            adminComboBox.setSelectedIndex(5);
        } else if (category.equals("History")) {
            adminComboBox.setSelectedIndex(6);
        } else if (category.equals("Self-help/Personal Development")) {
            adminComboBox.setSelectedIndex(7);
        } else if (category.equals("Business/Economics")) {
            adminComboBox.setSelectedIndex(8);
        } else if (category.equals("Travel")) {
            adminComboBox.setSelectedIndex(9);
        } else if (category.equals("Cookbooks")) {
            adminComboBox.setSelectedIndex(10);
        } else if (category.equals("Art/Photography")) {
            adminComboBox.setSelectedIndex(11);
        } else if (category.equals("Religion/Spirituality")) {
            adminComboBox.setSelectedIndex(12);
        } else if (category.equals("Science/Nature")) {
            adminComboBox.setSelectedIndex(13);
        } else if (category.equals("Children's Books")) {
            adminComboBox.setSelectedIndex(14);
        } else if (category.equals("Young Adult")) {
            adminComboBox.setSelectedIndex(15);
        } else if (category.equals("Graphic Novels/Comics")) {
            adminComboBox.setSelectedIndex(16);
        } else if (category.equals("Poetry")) {
            adminComboBox.setSelectedIndex(17);
        } else if (category.equals("Health/Fitness")) {
            adminComboBox.setSelectedIndex(18);
        } else if (category.equals("Technology/Computers")) {
            adminComboBox.setSelectedIndex(19);
        } else {
            adminComboBox.setSelectedIndex(0);
        }
        adminPagesField.setText(model.getValueAt(rowIndex, 4).toString());
        adminLinkField.setText(model.getValueAt(rowIndex, 5).toString());
        priceField.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_adminTableMouseClicked

    private void adminClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminClearButtonActionPerformed
        int c = JOptionPane.showConfirmDialog(this, "Do you want to clear all?", "Select", JOptionPane.YES_NO_OPTION);
        if (c == 0) {
            adminTitleField.setText(null);
            adminAuthorField.setText(null);
            adminPagesField.setText(null);
            adminISBNField.setText(null);
            adminLinkField.setText(null);
            adminComboBox.setSelectedIndex(0);
            priceField.setText("");
        }
    }//GEN-LAST:event_adminClearButtonActionPerformed

    private void adminClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminClearButtonMouseClicked

    }//GEN-LAST:event_adminClearButtonMouseClicked

    private void adminLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogOutButtonActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to log out now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
            LogPage logPage = new LogPage();
            logPage.setVisible(true);
        }
    }//GEN-LAST:event_adminLogOutButtonActionPerformed

    private void adminComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminComboBoxActionPerformed

    }//GEN-LAST:event_adminComboBoxActionPerformed

    private void adminUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUpdateButtonActionPerformed
        if (isEmptyBook()) {
            int bookid = Integer.parseInt(adminISBNField.getText());
            if (book.isIDexist(bookid)) {
                String bookname = adminTitleField.getText();
                String author = adminAuthorField.getText();
                String category = adminComboBox.getSelectedItem().toString();
                String page_num = adminPagesField.getText();
                String isbn = adminISBNField.getText();
                String link = adminLinkField.getText();
                String price = priceField.getText();

                book.update(bookid, bookname, author, category, page_num, link, price);
                adminTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"}));
                book.getBookValues(adminTable, "");
                clearAdmin(adminTitleField, adminAuthorField, adminPagesField, adminISBNField, adminLinkField, priceField, adminComboBox);
            } else {
                JOptionPane.showMessageDialog(this, "This ID doesn't exist");
            }
        }
    }//GEN-LAST:event_adminUpdateButtonActionPerformed

    private void adminRetrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRetrieveButtonActionPerformed
        book.getBookValues(adminTable, "");
    }//GEN-LAST:event_adminRetrieveButtonActionPerformed

    private void adminDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteButtonActionPerformed
        int bookid = Integer.parseInt(adminISBNField.getText());
        if (book.isIDexist(bookid)) {
            book.delete(bookid);
            adminTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"}));
            book.getBookValues(adminTable, "");
            clearAdmin(adminTitleField, adminAuthorField, adminPagesField, adminISBNField, adminLinkField, priceField, adminComboBox);
        } else {
            JOptionPane.showMessageDialog(this, "This ID doesn't exist");
        }
    }//GEN-LAST:event_adminDeleteButtonActionPerformed

    private void adminAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddButtonActionPerformed
        if (isEmptyBook()) {
            if (!book.isBookExist(adminTitleField.getText())) {
                int bookid = book.getMax();
                String bookname = adminTitleField.getText();
                String author = adminAuthorField.getText();
                String category = adminComboBox.getSelectedItem().toString();
                String page_num = adminPagesField.getText();
                String isbn = adminISBNField.getText();
                String link = adminLinkField.getText();
                String price = priceField.getText();

                book.insert(bookid, bookname, author, category, page_num, link, price);
                adminTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"}));
                book.getBookValues(adminTable, "");
                clearAdmin(adminTitleField, adminAuthorField, adminPagesField, adminISBNField, adminLinkField, priceField, adminComboBox);
            } else {
                JOptionPane.showMessageDialog(null, "This Book Already Exists!");
            }
        }
    }//GEN-LAST:event_adminAddButtonActionPerformed

    private void adminAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminAddButtonMouseClicked

    }//GEN-LAST:event_adminAddButtonMouseClicked

    private void adminISBNFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminISBNFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_adminISBNFieldKeyTyped

    private void adminISBNFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminISBNFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminISBNFieldKeyPressed

    private void adminPagesFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminPagesFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_adminPagesFieldKeyTyped

    private void adminPagesFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminPagesFieldKeyPressed

    }//GEN-LAST:event_adminPagesFieldKeyPressed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int bookid = Integer.parseInt(cartField.getText());
        if (!book.isIDexistCart(bookid)) {
            book.deleteCart(bookid);
            cartTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Title", "Author", "Category", "Page Number", "Download Link", "Price"}));
            book.getCartValues(cartTable, "");
            clearAdmin(cart1, cart2, cart3, cartField, userLinkField1, userLinkField2, cartbox);
        } else if (cartField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a book to delete!");
        } else {
            JOptionPane.showMessageDialog(this, "This ID doesn't exist");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to confirm your purchase?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                JOptionPane.showMessageDialog(null, "Purchase is confirmed. Redirecting to the payment page.");
                String url = "https://payment.page/";
                try {
                    Desktop.getDesktop().browse(new URI(url));
                    butTextField2.setText("Redirecting...");
                    this.dispose();
                    book.deleteAll();
                    book.getBookValues(cartTable, "");
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (URISyntaxException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Purchase is not confirmed. Please check your internet connection.");
        }

    }//GEN-LAST:event_buyButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        tabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void cartboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartboxActionPerformed

    private void deleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton2ActionPerformed
        book.getCartValues(cartTable, "");
    }//GEN-LAST:event_deleteButton2ActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        model = (DefaultTableModel) cartTable.getModel();
        rowIndex = cartTable.getSelectedRow();
        cartField.setText(model.getValueAt(rowIndex, 0).toString());
        cart1.setText(model.getValueAt(rowIndex, 1).toString());
        cart2.setText(model.getValueAt(rowIndex, 2).toString());
        String category = model.getValueAt(rowIndex, 3).toString();
        if (category.equals("Fiction")) {
            cartbox.setSelectedIndex(0);
        } else if (category.equals("Non-fiction")) {
            cartbox.setSelectedIndex(1);
        } else if (category.equals("Mystery/Thriller")) {
            cartbox.setSelectedIndex(2);
        } else if (category.equals("Romance")) {
            cartbox.setSelectedIndex(3);
        } else if (category.equals("Science Fiction/Fantasy")) {
            cartbox.setSelectedIndex(4);
        } else if (category.equals("Biography/Autobiography")) {
            cartbox.setSelectedIndex(5);
        } else if (category.equals("History")) {
            cartbox.setSelectedIndex(6);
        } else if (category.equals("Self-help/Personal Development")) {
            cartbox.setSelectedIndex(7);
        } else if (category.equals("Business/Economics")) {
            cartbox.setSelectedIndex(8);
        } else if (category.equals("Travel")) {
            cartbox.setSelectedIndex(9);
        } else if (category.equals("Cookbooks")) {
            cartbox.setSelectedIndex(10);
        } else if (category.equals("Art/Photography")) {
            cartbox.setSelectedIndex(11);
        } else if (category.equals("Religion/Spirituality")) {
            cartbox.setSelectedIndex(12);
        } else if (category.equals("Science/Nature")) {
            cartbox.setSelectedIndex(13);
        } else if (category.equals("Children's Books")) {
            cartbox.setSelectedIndex(14);
        } else if (category.equals("Young Adult")) {
            cartbox.setSelectedIndex(15);
        } else if (category.equals("Graphic Novels/Comics")) {
            cartbox.setSelectedIndex(16);
        } else if (category.equals("Poetry")) {
            cartbox.setSelectedIndex(17);
        } else if (category.equals("Health/Fitness")) {
            cartbox.setSelectedIndex(18);
        } else if (category.equals("Technology/Computers")) {
            cartbox.setSelectedIndex(19);
        } else {
            cartbox.setSelectedIndex(0);
        }
        cart3.setText(model.getValueAt(rowIndex, 4).toString());
        userLinkField1.setText(model.getValueAt(rowIndex, 5).toString());
        userLinkField2.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_cartTableMouseClicked

    private void deleteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton3ActionPerformed
        cart1.setText(null);
        cart2.setText(null);
        cartField.setText(null);
        cart3.setText(null);
        userLinkField1.setText(null);
        userLinkField2.setText(null);
        cartbox.setSelectedIndex(0);
        priceField.setText(null);

    }//GEN-LAST:event_deleteButton3ActionPerformed

    private void deleteButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton4ActionPerformed
        butTextField2.setText("Your total check is: " + book.calculateTotalPrice(cartTable, 6));
    }//GEN-LAST:event_deleteButton4ActionPerformed

    private void uDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uDetailsMouseClicked
        model = (DefaultTableModel) uDetails.getModel();
        rowIndex = uDetails.getSelectedRow();
        uid1.setText(model.getValueAt(rowIndex, 0).toString());
        uid2.setText(model.getValueAt(rowIndex, 1).toString());
        uid3.setText(model.getValueAt(rowIndex, 2).toString());
        uid4.setText(model.getValueAt(rowIndex, 3).toString());

    }//GEN-LAST:event_uDetailsMouseClicked

    private void uid3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uid3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_uid3KeyPressed

    private void uid3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uid3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_uid3KeyTyped

    private void adminAddButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminAddButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAddButton1MouseClicked

    private void adminAddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddButton1ActionPerformed
        if (isEmptyUser()) {
            if (!book.isUserExist(uid3.getText())) {
                int id = book.getMaxUser();
                String username = uid2.getText();
                String email = uid3.getText();
                String password = uid4.getText();

                book.insertUser(id, username, email, password);
                uDetails.setModel(new DefaultTableModel(null, new Object[]{"ID", "Username", "Email", "Password"}));
                book.getUserValues(uDetails, "");
            } else {
                JOptionPane.showMessageDialog(null, "This User Already Exists!");
            }
        }
    }//GEN-LAST:event_adminAddButton1ActionPerformed

    private void adminDeleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteButton1ActionPerformed
        int id = Integer.parseInt(uid1.getText());
        if (book.isIDexist_user(id)) {
            book.delete_user(id);
            uDetails.setModel(new DefaultTableModel(null, new Object[]{"ID", "Username", "Email", "Password"}));
            book.getUserValues(uDetails, "");
            clearAdmin(uid1, uid2, uid3, uid4);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user.");
        }
    }//GEN-LAST:event_adminDeleteButton1ActionPerformed

    private void adminRetrieveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRetrieveButton1ActionPerformed
        book.getUserValues(uDetails, "");
    }//GEN-LAST:event_adminRetrieveButton1ActionPerformed

    private void adminUpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUpdateButton1ActionPerformed
        if (isEmptyAdmin()) {
            int id = Integer.parseInt(uid1.getText());
            if (book.isUidExist(id)) {
                String email = uid3.getText();
                String username = uid2.getText();
                String password = uid4.getText();
                book.updateUser(username, email, password, id);
                uDetails.setModel(new DefaultTableModel(null, new Object[]{"ID", "Username", "Email", "Password"}));
                book.getUserValues(uDetails, "");
                JOptionPane.showMessageDialog(this, "User updated successfully.");
                clearAdmin(uid1, uid2, uid3, uid4);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user.");
            }
        }
    }//GEN-LAST:event_adminUpdateButton1ActionPerformed

    private void adminLogOutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogOutButton1ActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to log out now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
            LogPage logPage = new LogPage();
            logPage.setVisible(true);
        }
    }//GEN-LAST:event_adminLogOutButton1ActionPerformed

    private void adminClearButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminClearButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminClearButton1MouseClicked

    private void adminClearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminClearButton1ActionPerformed
        if (uid1.getText().isEmpty() && uid3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an ID or Email.");
        } else if (!uid1.getText().isEmpty()) {
            uDetails.setModel(new DefaultTableModel(null, new Object[]{"ID", "Username", "Email", "Password"}));
            book.getUserValues(uDetails, uid1.getText());
        } else {
            uDetails.setModel(new DefaultTableModel(null, new Object[]{"ID", "Username", "Email", "Password"}));
            book.getUserValues(uDetails, uid3.getText());
        }
    }//GEN-LAST:event_adminClearButton1ActionPerformed

    private void uid1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uid1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_uid1KeyTyped

    private void uid1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uid1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_uid1KeyPressed

    private void adminPagesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPagesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPagesFieldActionPerformed

    private void adminRetrieveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRetrieveButton2ActionPerformed
        clearAdmin(uid1, uid2, uid3, uid4);
        book.getUserValues(uDetails, "");
    }//GEN-LAST:event_adminRetrieveButton2ActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        model = (DefaultTableModel) userTable.getModel();
        rowIndex = userTable.getSelectedRow();
        userISBNField.setText(model.getValueAt(rowIndex, 0).toString());
        userTitleField.setText(model.getValueAt(rowIndex, 1).toString());
        userAuthorField.setText(model.getValueAt(rowIndex, 2).toString());
        String category = model.getValueAt(rowIndex, 3).toString();
        if (category.equals("Fiction")) {
            userComboBox.setSelectedIndex(0);
        } else if (category.equals("Non-fiction")) {
            userComboBox.setSelectedIndex(1);
        } else if (category.equals("Mystery/Thriller")) {
            userComboBox.setSelectedIndex(2);
        } else if (category.equals("Romance")) {
            userComboBox.setSelectedIndex(3);
        } else if (category.equals("Science Fiction/Fantasy")) {
            userComboBox.setSelectedIndex(4);
        } else if (category.equals("Biography/Autobiography")) {
            userComboBox.setSelectedIndex(5);
        } else if (category.equals("History")) {
            userComboBox.setSelectedIndex(6);
        } else if (category.equals("Self-help/Personal Development")) {
            userComboBox.setSelectedIndex(7);
        } else if (category.equals("Business/Economics")) {
            userComboBox.setSelectedIndex(8);
        } else if (category.equals("Travel")) {
            userComboBox.setSelectedIndex(9);
        } else if (category.equals("Cookbooks")) {
            userComboBox.setSelectedIndex(10);
        } else if (category.equals("Art/Photography")) {
            userComboBox.setSelectedIndex(11);
        } else if (category.equals("Religion/Spirituality")) {
            userComboBox.setSelectedIndex(12);
        } else if (category.equals("Science/Nature")) {
            userComboBox.setSelectedIndex(13);
        } else if (category.equals("Children's Books")) {
            userComboBox.setSelectedIndex(14);
        } else if (category.equals("Young Adult")) {
            userComboBox.setSelectedIndex(15);
        } else if (category.equals("Graphic Novels/Comics")) {
            userComboBox.setSelectedIndex(16);
        } else if (category.equals("Poetry")) {
            userComboBox.setSelectedIndex(17);
        } else if (category.equals("Health/Fitness")) {
            userComboBox.setSelectedIndex(18);
        } else if (category.equals("Technology/Computers")) {
            userComboBox.setSelectedIndex(19);
        } else {
            userComboBox.setSelectedIndex(0);
        }
        userPagesField.setText(model.getValueAt(rowIndex, 4).toString());
        userLinkField.setText(model.getValueAt(rowIndex, 5).toString());
        price.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_userTableMouseClicked

    private void userTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTitleFieldActionPerformed

    private void adminTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminTitleFieldActionPerformed

    private void adminAuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAuthorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAuthorFieldActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserPanel;
    private javax.swing.JButton addToCart;
    private javax.swing.JButton adminAddButton;
    private javax.swing.JButton adminAddButton1;
    private javax.swing.JTextField adminAuthorField;
    private javax.swing.JLabel adminBook;
    private javax.swing.JLabel adminBook1;
    private javax.swing.JLabel adminBook2;
    private javax.swing.JLabel adminBook3;
    private javax.swing.JButton adminClearButton;
    private javax.swing.JButton adminClearButton1;
    private javax.swing.JComboBox<String> adminComboBox;
    private javax.swing.JButton adminDeleteButton;
    private javax.swing.JButton adminDeleteButton1;
    private javax.swing.JTextField adminISBNField;
    private javax.swing.JTextField adminLinkField;
    private javax.swing.JButton adminLogOutButton;
    private javax.swing.JButton adminLogOutButton1;
    private javax.swing.JTextField adminPagesField;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton adminRetrieveButton;
    private javax.swing.JButton adminRetrieveButton1;
    private javax.swing.JButton adminRetrieveButton2;
    private javax.swing.JTable adminTable;
    private javax.swing.JTextField adminTitleField;
    private javax.swing.JButton adminUpdateButton;
    private javax.swing.JButton adminUpdateButton1;
    private javax.swing.JTextField butTextField2;
    private javax.swing.JButton buyButton;
    private javax.swing.JTextField cart1;
    private javax.swing.JTextField cart2;
    private javax.swing.JTextField cart3;
    private javax.swing.JTextField cartField;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JTable cartTable;
    private javax.swing.JComboBox<String> cartbox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton2;
    private javax.swing.JButton deleteButton3;
    private javax.swing.JButton deleteButton4;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JLabel detailsLabel1;
    private javax.swing.JLabel detailsLabel2;
    private javax.swing.JLabel detailsLabel4;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsPanel1;
    private javax.swing.JPanel detailsPanel2;
    private javax.swing.JPanel detailsPanel3;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JButton goBackButton;
    private javax.swing.JButton goToCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField price;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton receiptButton;
    private javax.swing.JButton receiptButton1;
    private javax.swing.JButton sortByAuthor;
    private javax.swing.JButton sortByTitleButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable uDetails;
    private javax.swing.JTextField uid1;
    private javax.swing.JTextField uid2;
    private javax.swing.JTextField uid3;
    private javax.swing.JTextField uid4;
    private javax.swing.JTextField userAuthorField;
    private javax.swing.JComboBox<String> userComboBox;
    private javax.swing.JTextField userISBNField;
    private javax.swing.JTextField userLinkField;
    private javax.swing.JTextField userLinkField1;
    private javax.swing.JTextField userLinkField2;
    private javax.swing.JButton userLogOutButton;
    private javax.swing.JTextField userPagesField;
    private javax.swing.JButton userRefreshButton;
    private javax.swing.JButton userSearchButton;
    private javax.swing.JTextField userSearchField;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField userTitleField;
    // End of variables declaration//GEN-END:variables
}
