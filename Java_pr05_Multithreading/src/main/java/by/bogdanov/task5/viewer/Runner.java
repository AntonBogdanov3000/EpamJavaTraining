package by.bogdanov.task5.viewer;

import by.bogdanov.task5.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Controller controller = new Controller();
        System.out.println("Enter a command");
        controller.executeTask(reader.readLine());
    }
}
