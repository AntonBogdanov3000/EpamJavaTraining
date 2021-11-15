package by.bogdanov.dao.mysql;

import by.bogdanov.dao.ConnectionCreator;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.OrderDao;
import by.bogdanov.entity.Order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    private static final String SQL_READ_ORDER_ID = "SELECT price, date, operation_id FROM orders WHERE id=?";
    private static final String SQL_SELECT_ALL_ORDERS = "SELECT * FROM orders";

    @Override
    public List<Order> readAll() throws DaoException {
        List<Order> orderList = new ArrayList<>();
        OperationDaoImpl operationDao;
        Connection connection = null;
        Statement statement = null;
        try {
            operationDao = new OperationDaoImpl();
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_ORDERS);
            while (resultSet.next()){
                Order order = new Order();
                order.setId(resultSet.getLong("id"));
                order.setPrice(resultSet.getInt("price"));
                order.setDate(resultSet.getDate("date"));
                order.setUserId(resultSet.getLong("user_id"));
                order.setOperation(operationDao.readById(resultSet.getLong("operation_id")));
                orderList.add(order);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return orderList;
    }

    @Override
    public Order readById(Long id) throws DaoException {
        Order order = new Order();
        OperationDaoImpl operationDao = new OperationDaoImpl();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_READ_ORDER_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
            order.setPrice(resultSet.getInt("price"));
            order.setDate(resultSet.getDate("date"));
            order.setOperation(operationDao.readById(resultSet.getLong("operation_id")));
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return order;
    }


    @Override
    public void delete(Long id) throws DaoException {

    }

    @Override
    public void create(Order order) throws DaoException {

    }

    @Override
    public void update(Order order) throws DaoException {

    }
}
