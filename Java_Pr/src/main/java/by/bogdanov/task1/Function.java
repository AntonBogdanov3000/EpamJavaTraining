package by.bogdanov.task1;

public class Function {
    int a;
    int b;

    public Function(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int returnFunc( ){
        return  2 * this.a + (this.b-2) * 5;
    }
}
