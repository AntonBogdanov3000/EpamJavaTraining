package by.bogdanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Main {
    private static Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws IOException ,InterruptedException{
        log.info("Start of main method");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter count of radians");
        String s = reader.readLine();
        new Radians(Double.parseDouble(s)).start();
        Thread.sleep(1000);

        System.out.println("Enter X...");
        String x = reader.readLine();
        System.out.println("Enter Y...");
        String y = reader.readLine();
        System.out.println("Result is " + new Function(Integer.parseInt(x),Integer.parseInt(y)).returnFunc());
        Thread.sleep(1000);
        System.out.println("Enter inner size of the circle");
        String in = reader.readLine();
        System.out.println("Enter outer size of the circle");
        String out = reader.readLine();
        System.out.println("Area of circle is "+ String.format("%.2f", new Circle(Integer.parseInt(in),Integer.parseInt(out)).sqare()));

        System.out.println("Enter X of point A coordinates");
        String ax = reader.readLine();
        System.out.println("Enter Y of point A coordinates");
        String ay = reader.readLine();
        Triangle.Point a = new Triangle.Point(Integer.parseInt(ax),Integer.parseInt(ay));
        System.out.println("Enter X of point B coordinates");
        String bx = reader.readLine();
        System.out.println("Enter Y of point B coordinates");
        String by = reader.readLine();
        Triangle.Point b = new Triangle.Point(Integer.parseInt(bx),Integer.parseInt(by));
        System.out.println("Enter X of point C coordinates");
        String cx = reader.readLine();
        System.out.println("Enter Y of point C coordinates");
        String cy = reader.readLine();
        Triangle.Point c = new Triangle.Point(Integer.parseInt(cx),Integer.parseInt(cy));
        new Triangle(a, b, c).triangleStart();
        Thread.sleep(1000);

        FigureArea area = new FigureArea(FigureArea.createOne());
        System.out.println("Enter coordinates for compare");
        int i = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());
        FigureArea.equiv(area,new FigureArea.Point(i,j));

        log.info("End of Main...");

    }
}
