package by.bogdanov.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    public  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String numberOfTask;

    public Controller(String numberOfTask){
    this.numberOfTask = numberOfTask;
    }

    public static void startCompare() throws IOException{
        System.out.println(Viewer.rb.getString("str2"));
        System.out.println(Compare.compareNumber(Integer.parseInt(reader.readLine())));
    }

    public static void startEnterDate() throws IOException{
        System.out.println(Viewer.rb.getString("str3"));
        int day = Integer.parseInt(reader.readLine());
        System.out.println(Viewer.rb.getString("str4"));
        int month = Integer.parseInt(reader.readLine());
        System.out.println(Dat.enterCorrectDate(day,month));
    }

    public static void startDistanceBetweenPoints() throws IOException{
        System.out.println(Viewer.rb.getString("str5"));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        Distance.Point pointZero = new Distance.Point(x,y);

        System.out.println(Viewer.rb.getString("str6"));
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        Distance.Point pointA = new Distance.Point(x1,y1);

        System.out.println(Viewer.rb.getString("str7"));
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());
        Distance.Point pointB = new Distance.Point(x2,y2);

        System.out.println(Distance.distanceToEntry(pointZero,pointA,pointB));
    }

    public static void startOfTable (){
        MultiplicationTable.tableForThree();
    }
    public static void startOfProgression() throws IOException{
        System.out.println(Viewer.rb.getString("str9"));
        String number = reader.readLine();
        System.out.println(Progression.arithmeticProgress(number));
    }

    public static void startCompareToNumber() throws IOException{
        System.out.println(Viewer.rb.getString("str10"));
        int a = Integer.parseInt(reader.readLine());
        System.out.println(Viewer.rb.getString("str11"));
        int b = Integer.parseInt(reader.readLine());
        System.out.println(Viewer.rb.getString("str12"));
        int c = Integer.parseInt(reader.readLine());
        System.out.println(Viewer.rb.getString("str13"));
        int d = Integer.parseInt(reader.readLine());
        ThreeNumbers.compareToD(a,b,c,d);
    }
    public static void startOfCalculation()throws IOException{
        Calculation.calculate();
    }
    public static void startOfTableForValues(){
        TableOfFunctionValues.Function();
    }

}
