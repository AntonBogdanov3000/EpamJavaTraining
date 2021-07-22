package number_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    int inner;
    int outer;

    public Solution(int inner, int outer){
        if(inner < outer){
        this.inner = inner;
        this.outer = outer;
        }
        else System.out.println("Error !");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter inner r");
        int in = Integer.parseInt(reader.readLine());
        System.out.println("Enter outer R");
        int out = Integer.parseInt(reader.readLine());

        Solution solution = new Solution(in,out);
        System.out.println(sqare(solution));
    }
    public static  double sqare(Solution round){
        return Math.PI * ((round.outer * round.outer) - (round.inner * round.inner));
    }
}
