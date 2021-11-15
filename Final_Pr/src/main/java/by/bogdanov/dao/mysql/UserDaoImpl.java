package by.bogdanov.dao.mysql;

import by.bogdanov.dao.ConnectionCreator;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.UserDao;
import by.bogdanov.entity.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static final String SQL_SELECT_ALL_USERS = "SELECT * FROM users";
    private static final String SQL_SELECT_USER_ID = "SELECT name, lastname, login FROM users WHERE id=?";

    @Override
    public List<User> readAll() throws DaoException {
        List<User> userList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        VehicleDaoImpl vehicleDao;
        OrderDaoImpl orderDao;
        try {
            vehicleDao = new VehicleDaoImpl();
            orderDao = new OrderDaoImpl();
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastname"));
                user.setPassword(resultSet.getString("password"));
                user.setLogin(resultSet.getString("login"));
                user.setEmail(resultSet.getString("email"));
                user.setCar(vehicleDao.readById(resultSet.getLong("id")));
                user.setOrder(orderDao.readById(resultSet.getLong("id")));
                userList.add(user);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return userList;
    }

    @Override
    public User readById(Long id) throws DaoException {
        User user = new User();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_SELECT_USER_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastname"));
                user.setLogin(resultSet.getString("login"));
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return user;
    }

    @Override
    public void delete(Long id) throws DaoException {

    }

    @Override
    public void create(User user) throws DaoException {

    }

    @Override
    public void update(User user) throws DaoException {
    }

}
