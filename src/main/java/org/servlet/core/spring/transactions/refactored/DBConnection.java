package org.servlet.core.spring.transactions.refactored;

import org.servlet.core.spring.transactions.refactored.trsc.TransactionCallback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:54321/dvdrental";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void executeTransaction(TransactionCallback callback) {
        try (Connection connection = getConnection()) {
            connection.setAutoCommit(false); // Start transaction
            try {
                callback.doInTransaction(connection); // Execute transactional code
                connection.commit(); // Commit transaction
            } catch (SQLException e) {
                connection.rollback(); // Rollback transaction on error
                throw new RuntimeException("Transaction failed, rollback initiated.", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Database connection failed.", e);
        }
    }
}
