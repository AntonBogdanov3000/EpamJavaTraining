package by.bogdanov.task2;

public class Distance {
    public static void main(String[] args) {
        distanceToEntry(new Point(0,0),new Point(1,3),new Point(1,1));
    }

    public static void distanceToEntry(Point start,Point a, Point b){

        double pointA = Math.sqrt((start.x - a.x) * (start.x - a.x) + (start.y - a.y) * (start.y - a.y));
        double pointB = Math.sqrt((start.x - b.x) * (start.x - b.x) + (start.y - b.y) * (start.y - b.y));
        if(pointA < pointB){
            System.out.println("A closer to start of coordinates");
        }else System.out.println("B closer to start of coordinates");
    }


    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
}
