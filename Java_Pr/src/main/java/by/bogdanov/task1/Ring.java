package by.bogdanov.task1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//TODO: rename Circle,int
public class Ring {
    private final static Logger log = LogManager.getLogger(Ring.class);
    public double inner;
    public double outer;

    public Ring (int inner, int outer){
        this.inner = inner;
        this.outer = outer;
        log.debug("Ring created");
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
