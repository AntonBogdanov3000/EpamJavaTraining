package by.bogdanov.controller.command.impl.user;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.User;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import by.bogdanov.service.UserService;
import javax.servlet.http.HttpServletRequest;


public class RegistrationCommandImpl implements Command {


    @Override
    public String execute(HttpServletRequest request) {
        String page;
        UserService userService = ServiceFactory.getInstance().getUserService();
        User user = new User();
         user.setName(request.getParameter("name"));
         user.setLastName(request.getParameter("lastname"));
         user.setPassword(request.getParameter("password"));
         user.setLogin(request.getParameter("login"));
         user.setTelephone(request.getParameter("telephone"));
         user.setRole(Integer.parseInt(request.getParameter("role")));
         page = request.getParameter("path");
        try {
            userService.createUser(user);
        }catch (ServiceException e){
            e.printStackTrace();
        }
        return page;
    }

}
