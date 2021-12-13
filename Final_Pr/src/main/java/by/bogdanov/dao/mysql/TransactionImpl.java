package by.bogdanov.dao.mysql;

import by.bogdanov.dao.*;
import java.sql.Connection;
import java.sql.SQLException;

public class TransactionImpl implements Transaction {

    private Connection connection;

    public TransactionImpl(Connection connection){
        this.connection = connection;
    }
    private TransactionImpl(){}

    @Override
    public <T extends BaseDao<?>> T createDao(DaoEnum key) throws DaoException {
        switch (key) {
            case USER_DAO: return (T) new UserDaoImpl(connection);
            case VEHICLE_DAO: return (T) new VehicleDaoImpl(connection);
        }
        return null;
    }

    @Override
    public void commit() throws DaoException {
     try {
         connection.commit();
     } catch (SQLException e){
         throw new DaoException(e);
     }
    }

    @Override
    public void rollback() throws DaoException {
    try {
        connection.rollback();
    }catch (SQLException e){
        throw new DaoException(e);
    }
    }
}
