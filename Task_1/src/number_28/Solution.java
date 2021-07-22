package number_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double countOfRadians = Double.parseDouble(reader.readLine());

        System.out.println(degrees(countOfRadians));
        System.out.println(minutes(countOfRadians));
        System.out.println(seconds(countOfRadians));
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
