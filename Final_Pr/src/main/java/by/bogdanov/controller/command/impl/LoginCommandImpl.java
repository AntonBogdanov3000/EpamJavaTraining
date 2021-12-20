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
        String page = request.getParameter("path");
        String password = request.getParameter("password");
        String login = request.getParameter("login");
        try {
            user = userService.readUserByLogin(login);
            if(!user.getPassword().equals(password) || !user.getLogin().equals(login)){
                return null;
            }
        }catch (ServiceException e){
            e.printStackTrace();
        }
        return page;
    }
    }

