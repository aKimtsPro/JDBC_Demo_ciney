package be.bstorm.akimts.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionFactory {

    private static final String URL = "jdbc:postgresql://localhost:55432/northwind";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}
