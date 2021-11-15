package by.bogdanov.dao.mysql;

import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.VehicleDao;
import by.bogdanov.entity.User;
import by.bogdanov.entity.Vehicle;
import by.bogdanov.dao.ConnectionCreator;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImpl implements VehicleDao {

    private static final String SQL_CREATE_VEHICLE = "";
    private static final String SQL_READ_VEHICLE_ID = "SELECT model, vin, year, mileage FROM vehicle WHERE id=?";
    private static final String SQL_SELECT_ALL_VEHICLES = "SELECT * FROM vehicle";

    @Override
    public List<Vehicle> readAll() throws DaoException {
        List<Vehicle> vehiclesList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_VEHICLES);
            while (resultSet.next()){
                Vehicle vehicle = new Vehicle();
                vehicle.setId(resultSet.getInt("id"));
                vehicle.setUserId(resultSet.getInt("user_id"));
                vehicle.setModel(resultSet.getString("model"));
                vehicle.setVinNumber(resultSet.getString("vin"));
                vehicle.setYear(resultSet.getInt("year"));
                vehicle.setMileage(resultSet.getInt("mileage"));
                vehiclesList.add(vehicle);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return vehiclesList;
    }

    @Override
    public Vehicle readById(Long id) throws DaoException {
        Vehicle vehicle = new Vehicle();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_READ_VEHICLE_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
            vehicle.setModel(resultSet.getString("model"));
            vehicle.setVinNumber(resultSet.getString("vin"));
            vehicle.setYear(resultSet.getInt("year"));
            vehicle.setMileage(resultSet.getInt("mileage"));
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return vehicle;
    }

    @Override
    public void delete(Long id) throws DaoException {

    }

    @Override
    public void create(Vehicle vehicle) throws DaoException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_CREATE_VEHICLE);
            vehicle.setModel(resultSet.getString("model"));
            vehicle.setVinNumber(resultSet.getString("vin"));
            vehicle.setYear(resultSet.getInt("year"));
            vehicle.setMileage(resultSet.getInt("mileage"));
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public void update(Vehicle vehicle) throws DaoException {
    }

}
