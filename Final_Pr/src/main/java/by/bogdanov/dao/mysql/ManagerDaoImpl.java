package by.bogdanov.dao.mysql;

import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.ManagerDao;
import by.bogdanov.entity.Manager;
import java.util.List;

public class ManagerDaoImpl implements ManagerDao {
    @Override
    public List<Manager> readAll() throws DaoException {
        return null;
    }

    @Override
    public Manager readById(Long id) throws DaoException {
        return null;
    }

    @Override
    public void delete(Long id) throws DaoException {

    }

    @Override
            public void create(Manager manager) throws DaoException {

    }

    @Override
    public void update(Manager manager) throws DaoException {

    }
}
