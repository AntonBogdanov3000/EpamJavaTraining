package by.bogdanov.DemoTread.ex03;

public class RunnableCarIsDaemon extends Thread {
    private String name;

    public RunnableCarIsDaemon(String name){
        super(name);
    }

    public void run(){
        if(isDaemon()){
            System.out.println(Thread.currentThread().getName() + " start daemon");
            for(int i=0; i<10; i++){
                System.out.println(i);
            }
            System.out.println("Daemon stop");
        }
        else System.out.println(Thread.currentThread().getName() + " is working");
        if(isInterrupted()){
            System.out.println(Thread.currentThread().getName() + " is interrupted");
        }
    }
}
