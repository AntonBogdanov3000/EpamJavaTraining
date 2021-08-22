package by.bogdanov.task3.controller;

import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.viewer.Viewer;

public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    public void executeTask(String request){
        Viewer.log.info("Controller is working ...");
        Command executeCommand;
        executeCommand = provider.getCommand(request);
        Viewer.log.info("Selected command  " + executeCommand);
        executeCommand.execute();

    }
}
