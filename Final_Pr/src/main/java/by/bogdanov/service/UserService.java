package by.bogdanov.service;

import by.bogdanov.entity.User;

public interface UserService extends Service{
void createUser(User user) throws ServiceException;
}
