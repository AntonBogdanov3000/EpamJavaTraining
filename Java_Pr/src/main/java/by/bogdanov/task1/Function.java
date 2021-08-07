package by.bogdanov.task1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Function {
    private final static Logger log = LogManager.getLogger(Function.class);
    double a;
    double b;

    public Function(double a, double b){
        this.a = a;
        this.b = b;
        log.info("Function created");
    }

    public double returnFunc( ){
        return  2 * this.a + (this.b-2) * 5;
    }
}
