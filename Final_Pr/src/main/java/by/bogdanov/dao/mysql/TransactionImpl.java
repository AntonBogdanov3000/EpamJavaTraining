package by.bogdanov.dao.mysql;

import by.bogdanov.dao.BaseDao;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.Transaction;
import java.sql.Connection;
import java.sql.SQLException;

public class TransactionImpl implements Transaction {

    private Connection connection;
    public TransactionImpl(Connection connection){
        this.connection = connection;
    }
    @Override
    public <Type extends BaseDao<?, ?>> Type createDao(Class<Type> key) throws DaoException {
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
