package by.bogdanov.controller.command.impl;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.Operation;
import by.bogdanov.service.OperationService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class ShowPricesCommandImpl implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        String page = request.getParameter("path");
        List<Operation> operationList;
        OperationService operationService = ServiceFactory.getInstance().getOperationService();
        try{
            operationList = operationService.readAllOperations();
            request.setAttribute("operationList",operationList);
        }catch (ServiceException e){}
        return page;
    }
}
