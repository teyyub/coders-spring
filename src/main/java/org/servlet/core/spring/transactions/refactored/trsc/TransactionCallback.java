package org.servlet.core.spring.transactions.refactored.trsc;

import java.sql.Connection;
import java.sql.SQLException;

@FunctionalInterface
public interface TransactionCallback {
    void doInTransaction(Connection connection) throws SQLException;
}
