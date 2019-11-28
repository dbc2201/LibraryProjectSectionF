/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 28/11/19
 *   Time: 2:26 PM
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection = null;
    private final static String url = "jdbc:mysql://localhost:3306/test";
    private final static String root = "root";
    private final static String password = "";

    public Connection getConnection() {
        return connection;
    }

    public boolean attemptConnection()
            throws SQLException {
        connection = DriverManager.getConnection
                (url, root, password);
        return connection != null;
    }

    public void closeConnection() throws SQLException {
        getConnection().close();
    }















}
