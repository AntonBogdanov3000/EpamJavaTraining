package by.Bogdanov.task_1;



public class Circle {
    int inner;
    int outer;

    public Circle (int inner, int outer){
        this.inner = inner;
        this.outer = outer;
    }
    public static  double sqare(Circle circle){
        return Math.PI * ((circle.outer * circle.outer) - (circle.inner * circle.inner));
    }
}
