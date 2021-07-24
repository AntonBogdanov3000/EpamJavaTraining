package by.Bogdanov.task_1;

public class Test {
    public static void main(String[] args) {
     Triangle tr = new Triangle (new Triangle.Point(2,4),new Triangle.Point(5,8),new Triangle.Point(10,14));
        System.out.println(Triangle.perimeter(tr));
    }
}
