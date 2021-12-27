package by.bogdanov.service.impl;

import by.bogdanov.dao.*;
import by.bogdanov.dao.mysql.OrderDaoImpl;
import by.bogdanov.dao.mysql.TransactionFactoryImpl;
import by.bogdanov.dao.mysql.UserDaoImpl;
import by.bogdanov.entity.Operation;
import by.bogdanov.entity.Order;
import by.bogdanov.entity.User;
import by.bogdanov.entity.Vehicle;
import by.bogdanov.service.ClearanceService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.UserService;
import java.util.ArrayList;
import java.util.Date;
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
            userDao.delete((int) user.getId());
        }catch (DaoException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public User readUserById(int id) throws ServiceException {
        User user;
        try {
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            user = userDao.readById(id);
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return user;
    }

    @Override
    public List<User> readAllUsers() throws ServiceException {
        List<User> userList;
        try{
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            userList = userDao.readAll();
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return userList;
    }

    @Override
    public User readUserByLogin(String login) throws ServiceException {
        User user;
        try {
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            user = userDao.findUserByLogin(login);
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return user;
    }

    public static void main(String[] args) throws ServiceException,DaoException {
        UserServiceImpl service = new UserServiceImpl();
        OrderServiceImpl orderService = new OrderServiceImpl();
        VehicleServiceImpl vehicleService = new VehicleServiceImpl();
        OperationServiceImpl operationService = new OperationServiceImpl();
        ClearanceServiceImpl clearanceService = new ClearanceServiceImpl();


    }


}
