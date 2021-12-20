package by.bogdanov.dao.mysql;

import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.OperationDao;
import by.bogdanov.entity.Operation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class OperationDaoImpl implements OperationDao {

    private Connection connection;
    public OperationDaoImpl(Connection connection){
        this.connection = connection;
    }
    public OperationDaoImpl(){}

    private final static String SQL_SELECT_ALL_OPERATIONS = "SELECT * FROM operations";
    private final static String SQL_READ_OPERATION_BY_ID = "SELECT operation_name, price FROM operations WHERE id=?";
    private final static String SQL_DELETE_OPERATION_BY_ID = "DELETE FROM operations WHERE id=?";
    private final static String SQL_CREATE_OPERATION = "INSERT INTO operations(operation_name, price, id) VALUES (?,?,?)";
    private final static String SQL_UPDATE_OPERATION = "UPDATE operations SET operation_name=?, price=? WHERE id=?";
    private final static String SQL_READ_OPERATION_BY_PRICE = "SELECT id, operation_name FROM operations WHERE price=?";
    private final static String SQL_READ_OPERATION_BY_ORDER_ID = "SELECT operation_id FROM order_operation WHERE order_id=?";

    @Override
    public List<Operation> readAll() throws DaoException {
        List<Operation> operationList = new ArrayList<>();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_OPERATIONS);
            while (resultSet.next()){
              Operation operation = new Operation();
              operation.setId(resultSet.getInt("id"));
              operation.setOperationName(resultSet.getString("operation_name"));
              operation.setOperationPrice(resultSet.getInt("price"));
              operationList.add(operation);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return operationList;
    }
    @Override
    public Operation readById(int id) throws DaoException {
        Operation operation = new Operation();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_READ_OPERATION_BY_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                operation.setOperationName(resultSet.getString("operation_name"));
                operation.setOperationPrice(resultSet.getInt("price"));
                operation.setId(id);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return operation;
    }

    @Override
    public void delete(int id) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_DELETE_OPERATION_BY_ID);
            statement.setLong(1,id);
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public void create(Operation operation) throws DaoException {
        try{
            PreparedStatement statement = connection.prepareStatement(SQL_CREATE_OPERATION);
            statement.setString(1,operation.getOperationName());
            statement.setInt(2,operation.getOperationPrice());
            statement.setLong(3,operation.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public void update(Operation operation) throws DaoException {
        try{
            PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_OPERATION);
            statement.setString(1,operation.getOperationName());
            statement.setInt(2,operation.getOperationPrice());
            statement.setLong(3,operation.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public Operation readByPrice(int price) throws DaoException {
        Operation operation = new Operation();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_READ_OPERATION_BY_PRICE);
            statement.setInt(1,price);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                operation.setId(resultSet.getInt("id"));
                operation.setOperationName(resultSet.getString("operation_name"));
                operation.setOperationPrice(price);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return operation;
    }

    @Override
    public List<Operation> readByOrderId(Long id) throws DaoException {
        List<Operation> operationList = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_READ_OPERATION_BY_ORDER_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Operation operation = readById(resultSet.getInt("operation_id"));
                operationList.add(operation);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return operationList;
    }
    }


