package by.bogdanov.service;

import by.bogdanov.entity.Order;
import java.util.List;

public interface OrderService extends Service{
    List<Order> readOrdersByUserId(int id)throws ServiceException;
}
