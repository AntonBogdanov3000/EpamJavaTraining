package by.Bogdanov.task_1;

public class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle (Point a , Point b, Point c){
        this.a=a;
        this.b = b;
        this.c = c;
    }


    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static double perimeter(Triangle triangle){
        double ax = triangle.a.x;
        double ay = triangle.a.y;
        double bx = triangle.b.x;
        double by = triangle.b.y;
        double cx = triangle.c.x;
        double cy = triangle.c.y;

        double ab = Math.pow((bx-ax),2) + Math.pow((by-ay),2);
        double bc = Math.pow((cx-bx),2) + Math.pow((cy-by),2);
        double ca = Math.pow((ax-cx),2) + Math.pow((ay-cy),2);
        //double ab = (bx - ax) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y);
        //double bc = (c.x - b.x) * (c.x - b.x) + (c.y - b.y) * (c.y - b.y);
        //double ca = (a.x - c.x) * (a.x - c.x) + (a.y - c.y) * (a.y - c.y);
        return Math.sqrt(ab) + Math.sqrt(bc) + Math.sqrt(ca);

    }
}
