package by.bogdanov.dao;

public interface TransactionFactory {
    public Transaction createTransaction();
    public void close();
}
