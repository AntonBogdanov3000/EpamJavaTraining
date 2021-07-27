package by.Bogdanov.task_1;



public class Circle {

    int inner;
    int outer;

    public Circle (int inner, int outer){
        this.inner = inner;
        this.outer = outer;
    }
    public void sqare(){
        System.out.println("Circle area " + String.format("%.2f",Math.PI * ((this.outer * this.outer) - (this.inner * this.inner))));
    }
}
