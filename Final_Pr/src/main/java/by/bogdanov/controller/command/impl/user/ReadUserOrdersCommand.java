package by.bogdanov.controller.command.impl.user;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.Order;
import by.bogdanov.entity.User;
import by.bogdanov.service.OrderService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import by.bogdanov.service.UserService;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class ReadUserOrdersCommand implements Command {

    private final Logger logger = LogManager.getLogger(ReadUserOrdersCommand.class);

    @Override
    public String execute(HttpServletRequest request) {
        User user;
        List<Order> orderList;
        String page = request.getParameter("path");
        UserService userService = ServiceFactory.getInstance().getUserService();
        OrderService orderService = ServiceFactory.getInstance().getOrderService();
        try {
            user = userService.readUserByLogin(request.getParameter("login"));
            logger.info("User id: " + user.getId() + " read his order history");
            orderList = orderService.readOrdersByUserId(user.getId());
            request.setAttribute("orderList",orderList);
        }catch (ServiceException e){
            logger.debug(e.getMessage());
        }
        return page;
    }
}
