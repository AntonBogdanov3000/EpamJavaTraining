package by.bogdanov.controller.command.impl.manager;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.Order;
import by.bogdanov.service.OrderService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ShowAllOrdersCommandImpl implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String page = request.getParameter("path");
        List<Order> orderList;
        OrderService orderService = ServiceFactory.getInstance().getOrderService();
        try{
            orderList = orderService.readAllOrders();
            request.setAttribute("orderList", orderList);
        } catch (ServiceException e){}
        return page;
    }
}
