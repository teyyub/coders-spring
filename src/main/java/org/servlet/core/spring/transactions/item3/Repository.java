package org.servlet.core.spring.transactions.item3;

import java.sql.Connection;
import java.sql.SQLException;

public interface Repository<T> {
    void save(Connection connection, T entity) throws SQLException;
    // Other CRUD methods can be added here, like find, update, delete, etc.
}