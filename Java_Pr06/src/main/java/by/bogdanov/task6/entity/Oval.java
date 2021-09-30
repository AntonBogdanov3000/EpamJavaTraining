package by.bogdanov.task6.entity;

public class Oval {

    private Point pointA;
    private Point pointB;
    private final int id;

    public Oval(int id, Point pointA,Point pointB){
        this.id = id;
        this.pointA = pointA;
        this.pointB = pointB;
    }
    public void setPointA(Point pointA){
        this.pointA = pointA;
    }
    public Point getPointA(){
        return pointA;
    }
    public void setPointB(Point pointB){
        this.pointB = pointB;
    }
    public Point getPointB(){
        return pointB;
    }
    public int getId() {
        return id;
    }
    public String toString(){
     return this.id + ": " + this.pointA + " " + this.pointB;
    }

}
