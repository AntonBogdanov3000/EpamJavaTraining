package by.bogdanov.dao;

public interface Transaction {
    <Type extends BaseDao<?,?>> Type createDao(Class<Type> key) throws DaoException;
    void commit() throws DaoException;
    void rollback() throws DaoException;
}
