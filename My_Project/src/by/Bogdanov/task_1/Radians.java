package by.Bogdanov.task_1;

public class Radians {

    double countOfRadians;

    public Radians(double rad){
        this.countOfRadians = rad;
    }
    public static String degrees(double a){
        double degree = a * (180 / Math.PI);
        return "Degrees " + String.format("%.3f",degree);
    }
    public  static String minutes(double a){
        double minute = (a * (180 / Math.PI))/60;
        return "Minutes " + String.format("%.3f",minute);
    }
    public static String seconds(double a){
        double second = (a * (180 /Math.PI)/60)/60;
        return "Seconds " + String.format("%.3f",second);
    }
}
