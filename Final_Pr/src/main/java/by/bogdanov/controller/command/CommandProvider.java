package by.bogdanov.controller.command;

import by.bogdanov.controller.command.impl.RegistrationCommandImpl;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<CommandName,Command> listCommand = new HashMap<>();

    public CommandProvider(){
        listCommand.put(CommandName.REGISTRATION, new RegistrationCommandImpl());
    }
    public Command getCommand(String text){
        Command command = listCommand.get(CommandName.valueOf(text));
        return command;
    }
}
