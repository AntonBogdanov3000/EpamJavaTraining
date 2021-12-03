package by.bogdanov.service.impl;

import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.DaoFactory;
import by.bogdanov.dao.UserDao;
import by.bogdanov.entity.User;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public void createUser(User user) throws ServiceException {
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            UserDao userDao = daoFactory.getUserDao();
            userDao.create(user);
        }catch (DaoException e){}
    }

}
