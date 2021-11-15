package by.bogdanov.dao.mysql;

import by.bogdanov.dao.ConnectionCreator;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.OperationDao;
import by.bogdanov.entity.Operation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperationDaoImpl implements OperationDao {

    private final static String SQL_READ_OPERATION_ID = "SELECT name, price FROM operations WHERE id=?";
    private final static String SQL_SELECT_ALL_OPERATIONS = "SELECT * FROM operations";

    @Override
    public List<Operation> readAll() throws DaoException {
        List<Operation> operationList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_OPERATIONS);
            while (resultSet.next()){
              Operation operation = new Operation();
              operation.setOperationName(resultSet.getString("name"));
              operation.setOperationPrice(resultSet.getInt("price"));
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return operationList;
    }
    @Override
    public Operation readById(Long id) throws DaoException {
        Operation operation = new Operation();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_READ_OPERATION_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                operation.setOperationName(resultSet.getString("name"));
                operation.setOperationPrice(resultSet.getInt("price"));
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return operation;
    }

    @Override
    public void delete(Long id) throws DaoException {

    }

    @Override
    public void create(Operation operation) throws DaoException {

    }

    @Override
    public void update(Operation operation) throws DaoException {

    }
}
