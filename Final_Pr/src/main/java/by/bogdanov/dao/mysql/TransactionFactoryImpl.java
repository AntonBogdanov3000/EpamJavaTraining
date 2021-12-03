package by.bogdanov.dao.mysql;

import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.Transaction;
import by.bogdanov.dao.TransactionFactory;
import by.bogdanov.dao.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;

public class TransactionFactoryImpl implements TransactionFactory {

    private Connection connection;
    public TransactionFactoryImpl() throws DaoException {
        connection = ConnectionPool.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
        }catch (SQLException e){
            throw new DaoException(e);
        }
    }

    @Override
    public Transaction createTransaction() throws DaoException {
        return new TransactionImpl(connection);
    }

    @Override
    public void close() {
    try {
        connection.close();
    }catch (SQLException e){}
    }
}
