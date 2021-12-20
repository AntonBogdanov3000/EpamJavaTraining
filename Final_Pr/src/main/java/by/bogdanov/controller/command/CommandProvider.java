package by.bogdanov.controller.command;

import by.bogdanov.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<CommandName,Command> listCommand = new HashMap<>();

    public CommandProvider(){
        listCommand.put(CommandName.REGISTRATION, new RegistrationCommandImpl());
        listCommand.put(CommandName.LOGIN, new LoginCommandImpl());
        listCommand.put(CommandName.READ_USER_CAR, new ReadUserCasCommandImpl());
        listCommand.put(CommandName.READ_USER_ORDER, new ReadUserOrdersCommand());
        listCommand.put(CommandName.ADD_CAR, new AddCarCommandImpl());
        listCommand.put(CommandName.LOGOUT, new LogoutCommandImpl());
        listCommand.put(CommandName.SHOW_PRICES, new ShowPricesCommandImpl());
    }
    public Command getCommand(String text){
        Command command = listCommand.get(CommandName.valueOf(text));
        return command;
    }
}
