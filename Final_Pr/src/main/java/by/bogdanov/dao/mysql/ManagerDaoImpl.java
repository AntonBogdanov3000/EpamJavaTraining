package by.bogdanov.dao.mysql;

import by.bogdanov.dao.connection.ConnectionCreator;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.ManagerDao;
import by.bogdanov.entity.Manager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ManagerDaoImpl implements ManagerDao {

    private Logger logger = LogManager.getLogger(ManagerDaoImpl.class);

    private static final String SQL_SELECT_ALL_MANAGER = "SELECT * FROM manager";
    private static final String SQL_SELECT_MANAGER_BY_ID = "SELECT name, lastname FROM manager WHERE id=?";
    private static final String SQL_DELETE_MANAGER_BY_ID = "DELETE FROM manager WHERE ID=?";
    private static final String SQL_CREATE_MANAGER = "INSERT INTO manager (id, name, lastname) VALUES (?,?,?)";
    private static final String SQL_UPDATE_MANAGER = "UPDATE manager SET name=?, lastname=? WHERE id=?";
    private static final String SQL_SELECT_MANAGER_BY_LASTNAME = "SELECT id, name FROM manager WHERE lastname=?";

    @Override
    public List<Manager> readAll() throws DaoException {
        List<Manager> managerList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_MANAGER);
            while (resultSet.next()){
                Manager manager = new Manager();
                manager.setId(resultSet.getLong("id"));
                manager.setName(resultSet.getString("name"));
                manager.setLastName(resultSet.getString("lastname"));
                managerList.add(manager);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return managerList;
    }

    @Override
    public Manager readById(Long id) throws DaoException {
        Manager manager = new Manager();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_SELECT_MANAGER_BY_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                manager.setName(resultSet.getString("name"));
                manager.setLastName(resultSet.getString("lastname"));
                manager.setId(id);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return manager;
    }

    @Override
    public void delete(Long id) throws DaoException {
        try {
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_DELETE_MANAGER_BY_ID);
            statement.setLong(1,id);
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
            public void create(Manager manager) throws DaoException {
        try{
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_CREATE_MANAGER);
            statement.setLong(1,manager.getId());
            statement.setString(2,manager.getName());
            statement.setString(3,manager.getLastName());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public void update(Manager manager) throws DaoException {
        try{
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_MANAGER);
            statement.setString(1,manager.getName());
            statement.setString(2,manager.getLastName());
            statement.setLong(3,manager.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public Manager readByLastName(String lastname) throws DaoException {
        Manager manager = new Manager();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_SELECT_MANAGER_BY_LASTNAME);
            statement.setString(1,lastname);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                manager.setId(resultSet.getLong("id"));
                manager.setName(resultSet.getString("name"));
                manager.setLastName(lastname);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return manager;
    }
}
