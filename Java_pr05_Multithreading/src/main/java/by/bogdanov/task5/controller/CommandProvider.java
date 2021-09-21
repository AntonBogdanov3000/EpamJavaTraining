package by.bogdanov.task5.controller;

import by.bogdanov.task5.controller.impl.LockerCommand;
import by.bogdanov.task5.controller.impl.SemaphoreCommand;
import java.util.HashMap;
import by.bogdanov.task5.controller.command.Command;
import java.util.Map;

public class CommandProvider {
    private final Map< CommandName, Command > listOfCommands = new HashMap<>();

    CommandProvider(){
        listOfCommands.put(CommandName.SEMAPHORE, new SemaphoreCommand());
        listOfCommands.put(CommandName.LOCKER, new LockerCommand());
    }
    public Command getCommand(String command){
        Command comm = listOfCommands.get(CommandName.valueOf(command));
        return comm;
    }
    }