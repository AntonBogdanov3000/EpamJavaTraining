package by.bogdanov.controller.command.impl;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.Order;
import by.bogdanov.entity.User;
import by.bogdanov.service.OrderService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import by.bogdanov.service.UserService;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class ReadUserOrdersCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        User user = new User();
        List<Order> orderList;
        String page = request.getParameter("path");
        UserService userService = ServiceFactory.getInstance().getUserService();
        OrderService orderService = ServiceFactory.getInstance().getOrderService();
        try {
            user = userService.readUserByLogin(request.getParameter("login"));
            orderList = orderService.readOrdersByUserId((int) user.getId());
            request.setAttribute("orderList",orderList);
        }catch (ServiceException e){}
        return page;
    }
}
