package by.bogdanov.task2;

public class MultiplicationTable {

    public void tableForThree() throws InterruptedException{
        for(int i=1;i<11;i++){
            int a = 3 * i;
            System.out.println(3 + " x " + i + " = " + a);
            Thread.sleep(500);
        }
    }
}
