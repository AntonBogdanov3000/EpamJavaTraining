package by.bogdanov.dao.mysql;

import by.bogdanov.dao.connection.ConnectionCreator;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.OrderDao;
import by.bogdanov.entity.Order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;


public class OrderDaoImpl implements OrderDao {

    private Logger logger = Logger.getLogger(OrderDaoImpl.class);

    private static final String SQL_SELECT_ALL_ORDERS = "SELECT * FROM orders";
    private static final String SQL_READ_ORDER_BY_ID = "SELECT user_id, total_price, date FROM orders WHERE id=?";
    private static final String SQL_DELETE_ORDER_BY_ID = "DELETE FROM orders WHERE id=?";
    private static final String SQL_CREATE_ORDER = "INSERT INTO orders(id, user_id, date, total_price) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE_ORDER = "UPDATE orders SET user_id=?, date=?, total_price=? WHERE id=?";
    private static final String SQL_READ_ORDERS_BY_USER_ID = "SELECT id, total_price, date FROM orders WHERE user_id=?";

    @Override
    public List<Order> readAll() throws DaoException {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_ORDERS);
            while (resultSet.next()){
                Order order = new Order();
                order.setId(resultSet.getLong("id"));
                order.setPrice(resultSet.getInt("total_price"));
                order.setDate(resultSet.getDate("date"));
                order.setUserId(resultSet.getLong("user_id"));
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
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_READ_ORDER_BY_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
            order.setUserId(resultSet.getLong("user_id"));
            order.setPrice(resultSet.getInt("total_price"));
            order.setDate(resultSet.getDate("date"));
            order.setId(id);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return order;
    }

    @Override
    public void delete(Long id) throws DaoException {
        try {
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_DELETE_ORDER_BY_ID);
            statement.setLong(1,id);
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public void create(Order order) throws DaoException {
        java.sql.Date sqlDate = new java.sql.Date(order.getDate().getTime());
        try{
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_CREATE_ORDER);
            statement.setLong(1,order.getId());
            statement.setLong(2,order.getUserId());
            statement.setDate(3,sqlDate);
            statement.setInt(4,order.getPrice());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Order order) throws DaoException {
        java.sql.Date sqlDate = new java.sql.Date(order.getDate().getTime());
        try{
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_ORDER);
            statement.setLong(1,order.getUserId());
            statement.setDate(2,sqlDate);
            statement.setInt(3,order.getPrice());
            statement.setLong(4,order.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public List<Order> readByUserId(Long id) throws DaoException {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_READ_ORDERS_BY_USER_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Order order = new Order();
                order.setId(resultSet.getLong("id"));
                order.setPrice(resultSet.getInt("total_price"));
                order.setDate(resultSet.getDate("date"));
                order.setUserId(id);
                orderList.add(order);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return orderList;
    }

}
