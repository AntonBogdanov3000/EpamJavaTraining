package by.Bogdanov.task_1;

public class Function {
    int a;
    int b;
    public Function(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void returnFunc(){
        System.out.println("Result of function "+2 * this.a + (this.b-2) * 5);
    }
}
