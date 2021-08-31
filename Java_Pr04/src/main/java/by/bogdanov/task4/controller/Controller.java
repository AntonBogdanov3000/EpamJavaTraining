package by.bogdanov.task4.controller;

import by.bogdanov.task4.controller.command.Command;

public class Controller {

   private final CommandProvider provider = new CommandProvider();

   public void executiveTask(String text){
       try {
       Command executeCommand = provider.getCommand(text);
       executeCommand.execute();}
       catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
   }
}
