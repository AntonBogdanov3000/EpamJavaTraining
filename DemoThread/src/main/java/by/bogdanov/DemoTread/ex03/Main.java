package by.bogdanov.DemoTread.ex03;


public class Main {
    public static void main(String[] args) {
        RunnableCar carOne = new RunnableCar("Bentley");
        Thread tr = new Thread(carOne, carOne.getBrand());
        RunnableCarIsDaemon carTwo = new RunnableCarIsDaemon("Dodge");
        RunnableCarIsDaemon carThree = new RunnableCarIsDaemon("Audi");

          tr.start();
          carTwo.setDaemon(true);
          carTwo.start();
          carThree.start();


        try{
            carThree.interrupt();
            carTwo.join();
            carOne.off();

        }catch (InterruptedException e){
            System.out.println(e.getMessage());

        }

    }
}
