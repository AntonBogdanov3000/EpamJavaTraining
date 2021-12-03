package by.bogdanov.dao;

import by.bogdanov.entity.Order;
import java.util.List;

public interface OrderDao extends BaseDao<Order,Long>{
    List<Order> readAll() throws DaoException;
    Order readById(Long id) throws DaoException;
    void delete(Long id) throws DaoException;
    void create(Order order) throws DaoException;
    void update(Order order) throws DaoException;
    List<Order> readByUserId(Long id) throws DaoException;
}
