package dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
    void create(T t) throws SQLException;
    T read(int id) throws SQLException;
    void update(T t) throws SQLException;
    void delete(int id) throws SQLException;  // int, not T
    List<T> list() throws SQLException;
}
