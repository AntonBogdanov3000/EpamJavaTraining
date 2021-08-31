package by.bogdanov.task4.controller;

import by.bogdanov.task4.controller.command.Command;
import by.bogdanov.task4.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<CommandName, Command> listOfCommand = new HashMap<>();

    CommandProvider() {
        listOfCommand.put(CommandName.LIST_CAR, new ListCarCommand());
        listOfCommand.put(CommandName.FILL_CAR, new FillCarCommand());
        listOfCommand.put(CommandName.CHECK, new CheckCarCommand());
        listOfCommand.put(CommandName.START_CAR, new StartCarCommand());
        listOfCommand.put(CommandName.CHANGE_TYRE, new ChangeTyreCommand());
    }

    public Command getCommand(String text){
        Command command = listOfCommand.get(CommandName.valueOf(text));
        return command;
    }
}
