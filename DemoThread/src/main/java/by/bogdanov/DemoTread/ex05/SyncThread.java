package by.bogdanov.DemoTread.ex05;

public class SyncThread extends Thread{

    private Resource resource;

    public SyncThread(String name, Resource resource){
        super(name);
        this.resource = resource;
    }
    public void run(){
        for (int i=0; i<5; i++){
            resource.writing(getName(),i);
        }
    }
}
