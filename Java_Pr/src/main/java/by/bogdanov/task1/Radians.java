package by.bogdanov.task1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Radians {
    private static Logger log = LogManager.getLogger(Radians.class);
    double countOfRadians;

    public Radians(double rad){
        this.countOfRadians = rad;
        log.info("Radians created");
    }
    public double degrees(){
        return  this.countOfRadians * (180 / Math.PI);
    }
    public double minutes(){
        return this.degrees() * 60;
        //System.out.println("Minutes " + String.format("%.3f",minute));
    }
    public double seconds(){
        return this.minutes() * 60;
       // System.out.println("Seconds " + String.format("%.3f", second));
    }
    public void start(){

        System.out.println("Minutes " + String.format("%.2f",this.minutes()));
        System.out.println("Seconds " + String.format("%.2f",this.seconds()));
        System.out.println("Degrees " + String.format("%.2f",this.degrees()));

    }
}
