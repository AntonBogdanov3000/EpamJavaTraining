package by.bogdanov.task1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Function {
    private Logger log = LogManager.getLogger(Function.class);
    int a;
    int b;

    public Function(int a, int b){
        this.a = a;
        this.b = b;
        log.info("Function created");

    }

    public int returnFunc( ){
        return  2 * this.a + (this.b-2) * 5;
    }
}
