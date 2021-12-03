package by.bogdanov.dao;

import by.bogdanov.entity.Clearance;
import java.util.List;

public interface ClearanceDao extends BaseDao<Clearance,Long>{
    List<Clearance> readAll() throws DaoException;
    Clearance readById(Long id) throws DaoException;
    void delete(Long id) throws DaoException;
    void create(Clearance clearance) throws DaoException;
    void update(Clearance clearance) throws DaoException;

}
