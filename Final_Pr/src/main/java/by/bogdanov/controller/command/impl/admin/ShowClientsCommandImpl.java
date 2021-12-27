package by.bogdanov.controller.command.impl.admin;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.User;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import by.bogdanov.service.UserService;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class ShowClientsCommandImpl implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String page = request.getParameter("path");
        List<User> userList;
        List<User> clientList = new ArrayList<>();
        int userRole = Integer.parseInt(request.getParameter("role"));
        UserService userService = ServiceFactory.getInstance().getUserService();
        try{
            userList = userService.readAllUsers();
            for(User client : userList){
                if(client.getRole() == userRole){
                    clientList.add(client);
                }
            }
            request.setAttribute("clientList",clientList);
        }catch (ServiceException e){
            e.printStackTrace();
        }
        return page;
    }
}
