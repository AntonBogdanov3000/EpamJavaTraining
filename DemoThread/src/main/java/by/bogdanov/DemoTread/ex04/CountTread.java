package by.bogdanov.DemoTread.ex04;

public class CountTread implements Runnable{
    CommonResource resource;

    public CountTread(CommonResource resource){
        this.resource = resource;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is start");
        synchronized (resource) {
            for (int i = 0; i < 5; i++) {
                System.out.println(resource.count);
                resource.count++;
            }
        }
    }
}
