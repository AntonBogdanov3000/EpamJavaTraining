package by.bogdanov.dao;

import by.bogdanov.entity.Manager;
import java.util.List;

public interface ManagerDao extends BaseDao<Manager,Long>{
    List<Manager> readAll() throws DaoException;
    Manager readById(Long id) throws DaoException;
    void delete(Long id) throws DaoException;
    void create(Manager manager) throws DaoException;
    void update(Manager manager) throws DaoException;
    Manager readByLastName(String lastname) throws DaoException;
}
