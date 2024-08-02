package org.servlet.core.spring.transactions.item3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseRepository<T> implements Repository<T> {

    protected void executeInsert(Connection connection, String query, List<Object> params) throws SQLException {
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            for (int i = 0; i < params.size(); i++) {
                stmt.setObject(i + 1, params.get(i));
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error executing insert: " + e.getMessage(), e);
        }
    }

    // Implement other common methods like find, update, delete, etc.
}
