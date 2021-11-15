package by.bogdanov.dao;

import by.bogdanov.entity.Entity;
import java.util.List;

public interface BaseDao<T extends Entity, K>{
    List<T> readAll() throws DaoException;
    T readById(K id) throws DaoException;
    void delete(K id) throws DaoException;
    void create(T t) throws DaoException;
    void update(T t) throws DaoException;
}
