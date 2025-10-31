package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "Suyash@308";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("unable to get connection " + e.getMessage());
        }
        return connection;
    }
}