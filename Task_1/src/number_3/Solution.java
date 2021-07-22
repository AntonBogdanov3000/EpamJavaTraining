package number_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter X");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Enter Y");
        int y = Integer.parseInt(reader.readLine());

        System.out.println(function(x,y));
    }
    public static int function(int a, int b){
        return 2 * a + (b-2) * 5;
    }
}
