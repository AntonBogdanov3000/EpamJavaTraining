package by.bogdanov.controller.command.impl;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.Clearance;
import by.bogdanov.service.ClearanceService;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ShowClearanceListCommandImpl implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String page = request.getParameter("path");
        List<Clearance> clearanceList;
        ClearanceService clearanceService = ServiceFactory.getInstance().getClearanceService();
        try {
            clearanceList = clearanceService.getAllClearance();
            request.setAttribute("clearanceList", clearanceList);
        }catch (ServiceException e){
            e.printStackTrace();
        }
        return page;
    }
}
