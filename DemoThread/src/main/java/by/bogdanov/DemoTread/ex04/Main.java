package by.bogdanov.DemoTread.ex04;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
        Thread thread = new Thread(new CountTread(new CommonResource()));
        thread.start();
        thread.setName("Thread " + i);
        }
    }
}
