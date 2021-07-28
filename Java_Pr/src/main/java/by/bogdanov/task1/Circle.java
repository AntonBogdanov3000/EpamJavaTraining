package by.bogdanov.task1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Circle {
    private static Logger log = LogManager.getLogger(Circle.class);
    int inner;
    int outer;

    public Circle (int inner, int outer){
        this.inner = inner;
        this.outer = outer;
        log.info("Circle created");
    }
    public double getInner(){
        return this.inner;
    }
    public double getOuter(){
        return this.outer;
    }
    public double sqare(){
        return  Math.PI * ((this.outer * this.outer) - (this.inner * this.inner));
    }
}
