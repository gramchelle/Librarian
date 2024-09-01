package dbConnection;

import java.sql.*;

public class dbConnection {

    private static final String username = "root";
    private static final String password = "mysql5558Ozlem";
    private static final String url = "jdbc:mysql://localhost:3306/lims";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
