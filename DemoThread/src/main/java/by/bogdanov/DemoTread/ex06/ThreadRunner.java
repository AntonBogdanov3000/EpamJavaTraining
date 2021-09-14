package by.bogdanov.DemoTread.ex06;

public class ThreadRunner {

    static int count = 0;
    final static StringBuffer buffer = new StringBuffer();

    public static void main(String[] args) throws InterruptedException{
         new Thread(){
            public void run(){
                try {
                synchronized (buffer){
                    while (ThreadRunner.count++ < 3){
                        buffer.append("X");
                        System.out.print("> " + count + " ");
                        System.out.println(buffer);
                        Thread.sleep(1000);
                    }
                }}catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }.start();
        Thread.sleep(100);
        while (ThreadRunner.count++ < 6){
            System.out.print("< " + count + " ");
            buffer.append("Y");
            System.out.println(buffer);
        }
    }

}
