package by.bogdanov.DemoTread.ex07;

public class Store {

    int count = 0;
    final int N = 5;

    synchronized int put(){
        if(count < N){
            count++;
            System.out.println(count + " In storage");
            return 1;
        }
            return 0;
    }

    synchronized int get(){
        if (count > 0){
            count--;
            System.out.println(count + " In storage");
            return 1;
        }
            return 0;
    }
}
