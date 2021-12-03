package by.bogdanov.dao;

public interface TransactionFactory {
    public Transaction createTransaction() throws DaoException;
    public void close();
}
