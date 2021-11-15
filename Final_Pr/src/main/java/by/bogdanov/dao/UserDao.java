package by.bogdanov.dao;

import by.bogdanov.entity.User;
import java.util.List;

public interface UserDao extends BaseDao<User,Long>{
    List<User> readAll() throws DaoException;
    User readById(Long id) throws DaoException;
    void delete(Long id) throws DaoException;
    void create(User user) throws DaoException;
    void update(User user) throws DaoException;
}
