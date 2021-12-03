package by.bogdanov.dao;

import by.bogdanov.entity.Operation;
import java.util.List;

public interface OperationDao extends BaseDao<Operation,Long>{
    List<Operation> readAll() throws DaoException;
    Operation readById(Long id) throws DaoException;
    void delete(Long id) throws DaoException;
    void create(Operation operation) throws DaoException;
    void update(Operation operation) throws DaoException;
    Operation readByPrice(int price) throws DaoException;
    List<Operation> readByOrderId(Long id) throws DaoException;
}
