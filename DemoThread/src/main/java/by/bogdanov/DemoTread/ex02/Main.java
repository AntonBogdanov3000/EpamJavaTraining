package by.bogdanov.DemoTread.ex02;

public class Main {
    public static void main(String[] args) {
        RunnablePerson person = new RunnablePerson("John");
        Thread one = new Thread(person);
        one.start();
        one.setPriority(Thread.NORM_PRIORITY);
        RunnablePerson person1 = new RunnablePerson("Kate");
        Thread two = new Thread(person1);
        two.start();
        two.setPriority(Thread.MIN_PRIORITY);
        RunnablePerson person2 = new RunnablePerson("Bob");
        Thread three = new Thread(person2);
        three.setPriority(Thread.MAX_PRIORITY);
        three.start();
    }
}
