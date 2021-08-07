package Task02;

/**
 * two points А(х1, у1) & В(х2, у2).
 * define which of these is closer to start of coordinates (0.0)
 */
public class Distance {


    public static String distanceToEntry(Point start,Point a, Point b){

        double pointA = Math.sqrt((start.x - a.x) * (start.x - a.x) + (start.y - a.y) * (start.y - a.y));
        double pointB = Math.sqrt((start.x - b.x) * (start.x - b.x) + (start.y - b.y) * (start.y - b.y));
        if(pointA < pointB){
              return "A is closer to start of coordinates";
        }else return "B is closer to start of coordinates";
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
