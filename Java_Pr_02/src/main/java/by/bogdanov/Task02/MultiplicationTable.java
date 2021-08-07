package by.bogdanov.Task02;

/**
 * Print multiplication table for number 3
 */

public class MultiplicationTable {

    public static void tableForThree(){
        System.out.println(Viewer.rb.getString("str8"));
        for(int i=1; i<11; i++){
            int a = 3 * i;
            System.out.println(3 + " x " + i + " = " + a);
        }
    }
}
