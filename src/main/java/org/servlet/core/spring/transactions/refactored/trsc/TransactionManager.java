package org.servlet.core.spring.transactions.refactored.trsc;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionManager {

    public void executeTransaction(TransactionCallback callback) {
        Connection connection = null; // Obtain connection from a datasource
        try {
            // Begin transaction
            connection.setAutoCommit(false);
            callback.doInTransaction(connection);
            // Commit transaction
            connection.commit();
        } catch (SQLException e) {
            // Rollback transaction in case of an error
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Close connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException closeEx) {
                    closeEx.printStackTrace();
                }
            }
        }
    }
}
