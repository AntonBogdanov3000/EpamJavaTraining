package by.bogdanov.DemoTread.ex03;


public class RunnableCar extends Car implements Runnable{

    private boolean isActive;

    public void off(){
        isActive = false;
    }
    public RunnableCar(String name){
        super(name);
        isActive = true;
    }


    public void run(){
        while (isActive){
            System.out.println("Start " + getBrand() );
        }
        System.out.println(Thread.currentThread().getName() + " is stopped");
        }
    }

