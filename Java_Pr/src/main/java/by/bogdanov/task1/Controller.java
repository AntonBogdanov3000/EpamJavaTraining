package by.bogdanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Controller {

    public static BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        public static void startOfRadians() throws IOException{
            System.out.println("Enter count of radians");
            new Radians(Double.parseDouble(reader.readLine())).start();
        }

        public static void startOfFunction() throws IOException {
            System.out.println("Enter X...");
            String x = reader.readLine();
            System.out.println("Enter Y...");
            String y = reader.readLine();
            System.out.println("Result is " + new Function(Integer.parseInt(x), Integer.parseInt(y)).returnFunc());
        }

        public static void startofRingArea() throws IOException{
            System.out.println("Enter inner size of the ring");
            String in = reader.readLine();
            System.out.println("Enter outer size of the ring");
            String out = reader.readLine();
            System.out.println("Area of ring is " + String.format("%.2f", new Ring(Integer.parseInt(in), Integer.parseInt(out)).sqare()));
        }

        public static void startOfTriangle()throws IOException{
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
        }

       public static void startOfFigureArea() throws IOException {
           FigureArea area = new FigureArea(FigureArea.createOne());
           System.out.println("Enter coordinates for compare");
           int i = Integer.parseInt(reader.readLine());
           int j = Integer.parseInt(reader.readLine());
           FigureArea.equiv(area, new FigureArea.Point(i, j));
       }
}
