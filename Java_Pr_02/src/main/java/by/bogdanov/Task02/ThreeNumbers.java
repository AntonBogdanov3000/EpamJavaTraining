package by.bogdanov.Task02;

/**
 * three numbers A B C.
 * define which of these is equal to D
 * if no one is not equal to D, calculate MAX value of them (A B C)
 */

public class ThreeNumbers {

    public static void compareToD(int a,int b,int c,int d){
        if(a == d){
            System.out.println("A = D"); }
        else if (b == d){
            System.out.println("B = D"); }
        else if (c == d){
            System.out.println("C = D"); }
        else System.out.println("Max = " + maxOfThreeNumbers(a,b,c));
    }
    public static int maxOfThreeNumbers(int a,int b,int c){
        int max ;
        if(a > b && a>c){
            max = a; }
        else if (b > a && b > c){
            max = b; }
        else max = c;
        return max;
    }
}
