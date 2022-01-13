package by.bogdanov.controller.command.impl;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.User;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import by.bogdanov.service.UserService;

import javax.servlet.http.HttpServletRequest;

public class LoginCommandImpl implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        User user;
        UserService userService = ServiceFactory.getInstance().getUserService();

        String password = request.getParameter("password");
        String login = request.getParameter("login");
        int idManager;
        try {
            user = userService.readUserByLogin(login);
            if(user.getRole()==2){
                idManager = user.getId();
                request.getSession().setAttribute("idManager", idManager);
            }
            switch (user.getRole()){
                case 1: return "welcomePage.jsp";
                case 2: return "ManagerPage.jsp";
                case 3: return "AdminPage.jsp";
            }
            if(!user.getPassword().equals(password) || !user.getLogin().equals(login)){
                return null;
            }
        }catch (ServiceException e){
            e.printStackTrace();
        }
        return null;
    }
}

