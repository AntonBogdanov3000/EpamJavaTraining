package by.bogdanov.dao.mysql;

import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.UserDao;
import by.bogdanov.entity.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class UserDaoImpl implements UserDao {


    private Connection connection;

    public UserDaoImpl(Connection connection){
        this.connection = connection;
    }
    public UserDaoImpl(){}

    private static final String SQL_INSERT_USER = "INSERT INTO users(name,lastname,password,login,telephone,role) VALUES(?,?,?,?,?,?)";
    private static final String SQL_SELECT_ALL_USERS = "SELECT * FROM users";
    private static final String SQL_SELECT_USER_ID = "SELECT name, lastname, login, role, telephone, password FROM users WHERE id=?";
    private static final String SQL_SELECT_USER_BY_LASTNAME = "SELECT id, name, password, login, telephone, role  FROM users WHERE lastname=?";
    private static final String SQL_DELETE_USER_BY_ID = "DELETE FROM users WHERE id=?";
    private static final String SQL_UPDATE_USER = "UPDATE users SET name=?,lastname=?,password=?,login=?,telephone=?,role=? WHERE id=?";

    @Override
    public List<User> readAll() throws DaoException {
        List<User> userList = new ArrayList<>();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastname"));
                user.setPassword(resultSet.getString("password"));
                user.setLogin(resultSet.getString("login"));
                user.setTelephone(resultSet.getString("telephone"));
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
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_SELECT_USER_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastname"));
                user.setLogin(resultSet.getString("login"));
                user.setRole(resultSet.getInt("role"));
                user.setTelephone(resultSet.getString("telephone"));
                user.setPassword(resultSet.getString("password"));
                user.setId(id);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return user;
    }

    @Override
    public void delete(Long id) throws DaoException {
    try {
        PreparedStatement statement = connection.prepareStatement(SQL_DELETE_USER_BY_ID);
        statement.setLong(1,id);
        statement.executeUpdate();
    }catch (SQLException e){
        throw new DaoException(e);
    }
    }

    @Override
    public void create(User user) throws DaoException {
     try{
         PreparedStatement statement = connection.prepareStatement(SQL_INSERT_USER);
         //statement.setLong(1,user.getId());
         statement.setString(1,user.getName());
         statement.setString(2,user.getLastName());
         statement.setString(3,user.getPassword());
         statement.setString(4,user.getLogin());
         statement.setString(5,user.getTelephone());
         statement.setInt(6,user.getRole());
         statement.executeUpdate();
     }catch (SQLException e){
         throw new DaoException(e);
     }
    }

    @Override
    public void update(User user) throws DaoException {
        try{
            PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_USER);
            statement.setString(1,user.getName());
            statement.setString(2,user.getLastName());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getLogin());
            statement.setString(5, user.getTelephone());
            statement.setLong(6,user.getId());
            statement.setInt(7,user.getRole());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public List<User> findUserByLastName(String lastName) throws DaoException {
        List<User> userList = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_SELECT_USER_BY_LASTNAME);
            statement.setString(1,lastName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setTelephone(resultSet.getString("telephone"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setLogin(resultSet.getString("login"));
                user.setRole(resultSet.getInt("role"));
                user.setLastName(lastName);
                userList.add(user);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return userList;
    }
}
