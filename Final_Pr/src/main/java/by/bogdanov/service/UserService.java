package by.bogdanov.service;

import by.bogdanov.dao.DaoException;
import by.bogdanov.entity.User;
import java.util.List;

public interface UserService extends Service{
void createUser(User user) throws ServiceException;
void deleteUser(User user) throws ServiceException;
List<User> readAllUsers()throws ServiceException;
}
