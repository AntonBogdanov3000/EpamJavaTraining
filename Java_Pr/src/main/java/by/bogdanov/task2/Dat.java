package by.bogdanov.task2;

public class Dat {
    public static void main(String[] args) {
       enterCorrectDate(3,11);
    }
    public static void enterCorrectDate(int day, int month){
        if (day<=0 || day>31 && month<=0 || month>12)
            System.out.println("Incorrect date ");
        else System.out.println("Correct date");

    }
}
