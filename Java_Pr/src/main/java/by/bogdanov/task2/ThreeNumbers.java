package by.bogdanov.task2;

public class ThreeNumbers {

    public static void main(String[] args) {
        compareToD(2,3,5,4);
    }
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
        int max = 0;
        if(a > b && a>c){
            max = a; }
        else if (b > a && b > c){
            max = b; }
        else max = c;
        return max;
    }
}
