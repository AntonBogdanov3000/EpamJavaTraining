package by.bogdanov.task2;

/**
 * for current value define arithmetic progression
 */

public class Progression {

    public static boolean arithmeticProgress(String number){
        char[] c = number.toCharArray();
        int a = c[1]-c[0];
        int b = 0;
        for(int i=1; i<c.length; i++) {
           if(c.length<=2){
               System.out.println("Number must contain more than 2 digits !");
               Viewer.log.error("Number must contain more than 2 digits !");
               break;
           }
           if(c[i]-c[i-1]==a){
           b++;
           }
        }
        return b == c.length - 1;

    }
}
