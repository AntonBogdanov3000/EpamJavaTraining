package by.bogdanov.DemoTread.ex05;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        Resource rs = null;
        try {
            rs = new Resource("C:\\Users\\Оксана\\Desktop\\23.txt");
            SyncThread tr1 = new SyncThread("One",rs);
            SyncThread tr2 = new SyncThread("Two",rs);
            tr1.start();
            tr2.start();
            tr1.join();
            tr2.join();

        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            rs.close();
        }
        System.out.println("END");
    }
}
