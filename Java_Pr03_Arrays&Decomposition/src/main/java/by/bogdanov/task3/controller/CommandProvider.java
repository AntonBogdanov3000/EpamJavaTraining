package by.bogdanov.task3.controller;

import by.bogdanov.task3.controller.impl.*;
import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.viewer.Viewer;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {

    private final Map< CommandName, Command > listOfCommands = new HashMap<>();

    CommandProvider(){
     listOfCommands.put(CommandName.BUBBLE_SORT, new BubbleSortCommand());
     listOfCommands.put(CommandName.INSERT_SORT, new InsertSortCommand());
     listOfCommands.put(CommandName.SELECTION_SORT, new SelectionSortCommand());
     listOfCommands.put(CommandName.SHAKE_SORT, new ShakeSortCommand());
     listOfCommands.put(CommandName.CREATE_ARR, new CreateArrayCommand());
     listOfCommands.put(CommandName.MATRIX_TR, new TranspositionOfMatrixCommand());
     listOfCommands.put(CommandName.MATRIX_SUM, new SumOfMatrixCommand());
     listOfCommands.put(CommandName.MATRIX_MULT, new MultiplicationOfMatrixCommand());
     listOfCommands.put(CommandName.MATRIX_SUB, new SubtractionOfMatrixCommand());
    }
    public Command getCommand(String command){
        Command comm = listOfCommands.get(CommandName.valueOf(command));
        return comm;
    }
}
