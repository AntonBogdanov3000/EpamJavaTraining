package by.Bogdanov.task_1;

public class Radians {

    double countOfRadians;

    public Radians(double rad){
        this.countOfRadians = rad;
    }
    public void degrees(){
        double degree = this.countOfRadians * (180 / Math.PI);
        System.out.println("Degrees " + String.format("%.3f",degree));
    }
    public void minutes(){
        double minute = (this.countOfRadians * (180 / Math.PI))/60;
        System.out.println("Minutes " + String.format("%.3f",minute));
    }
    public void seconds(){
        double second = (this.countOfRadians * (180 /Math.PI)/60)/60;
        System.out.println("Seconds " + String.format("%.3f", second));
    }
    public void start(){
        this.minutes();
        this.seconds();
        this.degrees();
    }
}
