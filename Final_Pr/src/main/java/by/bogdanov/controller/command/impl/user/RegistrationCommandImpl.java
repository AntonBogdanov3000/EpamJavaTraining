package by.bogdanov.controller.command.impl.user;

import by.bogdanov.controller.command.Command;
import by.bogdanov.entity.User;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.ServiceFactory;
import by.bogdanov.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class RegistrationCommandImpl implements Command {

    private final Logger logger = LogManager.getLogger(RegistrationCommandImpl.class);

    @Override
    public String execute(HttpServletRequest request) {
        String page;
        UserService userService = ServiceFactory.getInstance().getUserService();
        User user = new User();


        if(request.getParameter("name").isEmpty() || request.getParameter("lastname").isEmpty() ||
        request.getParameter("password").isEmpty() || request.getParameter("login").isEmpty() ||
        request.getParameter("telephone").isEmpty()){
            request.setAttribute("nullDataForUser", "Empty enter is not valid");
            return "registration.jsp";
        }else{

         user.setName(request.getParameter("name"));
         user.setLastName(request.getParameter("lastname"));
         user.setPassword(request.getParameter("password"));
         user.setLogin(request.getParameter("login"));
         user.setTelephone(request.getParameter("telephone"));
         user.setRole(Integer.parseInt(request.getParameter("role")));
            logger.info("!!" + request.getParameter("path"));
         page = request.getParameter("path");}
        try {
            if(user.getRole() == 2){
                page = "AdminPage.jsp";
            }
            userService.createUser(user);
            logger.info("New user has been created");
        }catch (ServiceException e){
            logger.debug(e.getMessage());
            e.printStackTrace();
        }
        return page;
    }

}
