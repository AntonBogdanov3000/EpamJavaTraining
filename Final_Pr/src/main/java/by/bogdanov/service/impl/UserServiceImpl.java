package by.bogdanov.service.impl;

import by.bogdanov.dao.*;
import by.bogdanov.dao.mysql.TransactionFactoryImpl;
import by.bogdanov.entity.User;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.UserService;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl extends ServiceImpl implements UserService {


    @Override
    public void createUser(User user) throws ServiceException {
        try {
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            userDao.create(user);
        }catch (DaoException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void deleteUser(User user) throws ServiceException {
        try{
            DaoFactory daoFactory = DaoFactory.getInstance();
            UserDao userDao = daoFactory.getUserDao();
            userDao.delete(user.getId());
        }catch (DaoException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public List<User> readAllUsers() throws ServiceException {
        List<User> userList = new ArrayList<>();
        try{
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            userList.addAll(userDao.readAll());
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return userList;
    }

    public static void main(String[] args) throws ServiceException,DaoException {
        UserServiceImpl service = new UserServiceImpl();
        User user1 = new User(5,"Chuck","Norris","Ranger",
                "CHAKA","+375339874563",1);
        service.createUser(user1);



    }


}
