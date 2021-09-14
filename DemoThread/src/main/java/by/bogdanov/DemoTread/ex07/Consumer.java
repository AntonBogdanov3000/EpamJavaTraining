package by.bogdanov.DemoTread.ex07;

public class Consumer extends Thread{

    Store store;
    int product = 0;
    final int N = 5;

    public Consumer(Store store){
        this.store = store;
    }
    public void run(){
        try {
        while (product < N) {
            product = product + store.get();
            System.out.println("Consumer buy " + product + " goods");
            sleep(100);
        }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
