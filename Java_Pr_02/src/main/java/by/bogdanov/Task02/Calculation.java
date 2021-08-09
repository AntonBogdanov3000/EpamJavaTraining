package by.bogdanov.task02;

/**
 * enter two numbers A & B and characters (+, –, /, *),calculate value Z
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Calculation {

    public static void calculate() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){

            System.out.println("Enter X");
            double a = Double.parseDouble(reader.readLine());
            if(a==0.0){break;}
            System.out.println("Enter Y");
            double b = Double.parseDouble(reader.readLine());
            System.out.println("Enter character  + - / *");
            char c = reader.readLine().charAt(0);
            if (b == 0 && c=='/'){
                System.out.println("Incorrect operation /0 ");
                Viewer.log.error("Incorrect operation " + c + b);
                break;}
                if (c!='+'&&c!='-'&&c!='*'&&c!='/'){
                System.out.println("Incorrect character");
                Viewer.log.error("Incorrect char " + c);
                break;}
                else
            System.out.println("Z = " + calculator(a,b,c)+"\n");

        }
    }

    public static double calculator(double a, double b , char c) {
        double z = 0;
            if (c == '/') {
                z = a / b;
            }
            if (c == '*') {
                z = a * b;
            }
            if (c == '+') {
                z = a + b;
            }
            if (c == '-') {
                z = a - b;
        }return z;
    }

}
