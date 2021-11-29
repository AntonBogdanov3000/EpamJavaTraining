package by.bogdanov.dao;


import by.bogdanov.entity.Vehicle;
import java.util.List;

public interface VehicleDao extends BaseDao<Vehicle,Long> {
    List<Vehicle> readAll() throws DaoException;
    Vehicle readById(Long id) throws DaoException;
    void delete(Long id) throws DaoException;
    void create(Vehicle vehicle) throws DaoException;
    void update(Vehicle vehicle) throws DaoException;
    List<Vehicle> readByYear(int year) throws DaoException;
}
