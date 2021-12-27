package by.bogdanov.controller.command.impl.manager;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.Operation;
import by.bogdanov.entity.Order;
import by.bogdanov.service.OperationService;
import by.bogdanov.service.OrderService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import javax.servlet.http.HttpServletRequest;

public class UpdateOrderCommandImpl implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String page = request.getParameter("path");
        Operation operation;
        Order order;
        int orderId;

        OperationService operationService = ServiceFactory.getInstance().getOperationService();
        OrderService orderService = ServiceFactory.getInstance().getOrderService();

        try{
            String s = request.getParameter("operation");
            String or = request.getParameter("order");
            operation = operationService.readOperationById(Integer.parseInt(s.substring(14,15)));
            order = orderService.readOrderById(Integer.parseInt(or.substring(24,26)));
            order.setPrice(order.getPrice() + operation.getOperationPrice());
            orderId = order.getId();
            orderService.updateOrder(order);
            operationService.createOrderOperation(orderId,operation.getId());
        }catch (ServiceException e){
            e.printStackTrace();
        }
        return page;
    }
}
