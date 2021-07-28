package by.bogdanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Main {
    private static Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws IOException {
        log.info("Start of main method");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter count of radians");
        String s = reader.readLine();

        new Radians(Double.parseDouble(s)).start();

        System.out.println("Enter X...");
        String x = reader.readLine();
        System.out.println("Enter Y...");
        String y = reader.readLine();
        System.out.println("Result is " + new Function(Integer.parseInt(x),Integer.parseInt(y)).returnFunc());

        System.out.println("Enter inner size of the circle");
        String in = reader.readLine();
        System.out.println("Enter outer size of the circle");
        String out = reader.readLine();
        new Circle(Integer.parseInt(in),Integer.parseInt(out)).sqare();

        System.out.println("Enter point A coordinates");
        String ax = reader.readLine();
        String ay = reader.readLine();
        Triangle.Point a = new Triangle.Point(Integer.parseInt(ax),Integer.parseInt(ay));
        System.out.println("Enter point B coordinates");
        String bx = reader.readLine();
        String by = reader.readLine();
        Triangle.Point b = new Triangle.Point(Integer.parseInt(bx),Integer.parseInt(by));
        System.out.println("Enter point C coordinates");
        String cx = reader.readLine();
        String cy = reader.readLine();
        Triangle.Point c = new Triangle.Point(Integer.parseInt(cx),Integer.parseInt(cy));
        new Triangle(a, b, c).triangleStart();
        log.info("End of Main...");

    }
}
