package by.bogdanov.dao.mysql;

import by.bogdanov.dao.ClearanceDao;
import by.bogdanov.dao.connection.ConnectionCreator;
import by.bogdanov.dao.DaoException;
import by.bogdanov.entity.Clearance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ClearanceDaoImpl implements ClearanceDao {


    private static final String SQL_SELECT_ALL_CLEARANCE = "SELECT * FROM clearance";
    private static final String SQL_READ_CLEARANCE_BY_ID = "SELECT name, start_date, end_date FROM clearance WHERE id=?";
    private static final String SQL_DELETE_CLEARANCE_BY_ID = "DELETE FROM clearance WHERE id=?";
    private static final String SQL_CREATE_CLEARANCE = "INSERT INTO clearance(id,name,start_date,end_date) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE_CLEARANCE = "UPDATE clearance SET name=?,start_date=?,end_date=? WHERE id=?";
    @Override
    public List<Clearance> readAll() throws DaoException {
        List<Clearance> clearanceList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_CLEARANCE);
            while (resultSet.next()){
                Clearance clearance = new Clearance();
                clearance.setId(resultSet.getLong("id"));
                clearance.setName(resultSet.getString("name"));
                clearance.setStartDate(resultSet.getDate("start_date"));
                clearance.setEndDate(resultSet.getDate("end_date"));
                clearanceList.add(clearance);
            }
        } catch (SQLException e){
            throw new DaoException(e);
        }
        return clearanceList;
    }

    @Override
    public Clearance readById(int id) throws DaoException {
        Clearance clearance = new Clearance();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionCreator.getInstance().createConnection();
            statement = connection.prepareStatement(SQL_READ_CLEARANCE_BY_ID);
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                clearance.setName(resultSet.getString("name"));
                clearance.setStartDate(resultSet.getDate("start_date"));
                clearance.setEndDate(resultSet.getDate("end_date"));
                clearance.setId(id);
            }
        }catch (SQLException e){
            throw new DaoException(e);
        }
        return clearance;
    }

    @Override
    public void delete(int id) throws DaoException {
        try {
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_DELETE_CLEARANCE_BY_ID);
            statement.setLong(1,id);
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public void create(Clearance clearance) throws DaoException {
        java.sql.Date sqlDateStart = new java.sql.Date(clearance.getStartDate().getTime());
        java.sql.Date sqlDateEnd = new java.sql.Date(clearance.getEndDate().getTime());
        try{
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_CREATE_CLEARANCE);
            statement.setString(1,clearance.getName());
            statement.setDate(2,sqlDateStart);
            statement.setDate(3,sqlDateEnd);
            statement.setLong(4,clearance.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Clearance clearance) throws DaoException {
        java.sql.Date sqlDateStart = new java.sql.Date(clearance.getStartDate().getTime());
        java.sql.Date sqlDateEnd = new java.sql.Date(clearance.getEndDate().getTime());
        try{
            Connection connection = ConnectionCreator.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_CLEARANCE);
            statement.setString(1,clearance.getName());
            statement.setDate(2,sqlDateStart);
            statement.setDate(3,sqlDateEnd);
            statement.setLong(4,clearance.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }
}
