package by.bogdanov.service.impl;

import by.bogdanov.dao.*;
import by.bogdanov.dao.mysql.TransactionFactoryImpl;
import by.bogdanov.entity.Operation;
import by.bogdanov.entity.Order;
import by.bogdanov.entity.User;
import by.bogdanov.service.OrderService;
import by.bogdanov.service.ServiceException;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl extends ServiceImpl implements OrderService {
    @Override
    public List<Order> readOrdersByUserId(int id) throws ServiceException {
        List<Order> orderList = new ArrayList<>();
        List<Order> result = new ArrayList<>();
        List<Operation> operationList = new ArrayList<>();
        User user = new User();
        try {
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();

            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            OrderDao orderDao = transaction.createDao(DaoEnum.ORDER_DAO);
            OperationDao operationDao = transaction.createDao(DaoEnum.OPERATION_DAO);

            user = userDao.readById(id);
            orderList = orderDao.readAll();
            for(Order order : orderList){
                if(order.getUserId() == user.getId()){
                    operationList = operationDao.readByOrderId(order.getId());
                    order.setOperationList(operationList);
                    result.add(order);
                }
            }
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return result;
    }
}
