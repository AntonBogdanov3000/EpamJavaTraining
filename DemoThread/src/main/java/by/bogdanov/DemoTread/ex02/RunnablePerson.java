package by.bogdanov.DemoTread.ex02;

public class RunnablePerson extends Person implements Runnable{

    public RunnablePerson(String name){
        super(name);
    }
    public void run(){
        for (int i=0; i<11; i++){
            System.out.println(getName() + " Hello");
        }
    }
}
