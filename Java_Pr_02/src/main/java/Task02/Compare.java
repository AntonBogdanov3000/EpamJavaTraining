package Task02;

/**
 * compare current number and number 3
 * print Yes if true
 * print No if false
 */

public class Compare {

    public static String result;

    public static String compareNumber(int number){
        result = number < 3 ? "Yes":"No";
        return result;
    }

}
