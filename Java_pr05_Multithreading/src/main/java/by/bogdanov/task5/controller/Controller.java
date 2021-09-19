package by.bogdanov.task5.controller;

import by.bogdanov.task5.controller.command.Command;

public class Controller {

    private final CommandProvider commandProvider = new CommandProvider();

    public void executeTask(String request){
        Command executeCommand = commandProvider.getCommand(request);
        executeCommand.execute();
    }
}
