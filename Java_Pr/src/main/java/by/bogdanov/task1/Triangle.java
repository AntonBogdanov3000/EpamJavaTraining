package by.bogdanov.task1;

public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public Triangle (Point a , Point b, Point c){
        this.a = a;
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

        double a = Math.sqrt(Math.pow((bx-ax),2) + Math.pow((by-ay),2));
        double b = Math.sqrt(Math.pow((cx-bx),2) + Math.pow((cy-by),2));
        double c = Math.sqrt(Math.pow((cx-ax),2) + Math.pow((cy-ay),2));
        return a + b + c;
    }
    public static double area(Triangle triangle){
        double ax = triangle.a.x;
        double ay = triangle.a.y;
        double bx = triangle.b.x;
        double by = triangle.b.y;
        double cx = triangle.c.x;
        double cy = triangle.c.y;

        double a = Math.sqrt(Math.pow((bx-ax),2) + Math.pow((by-ay),2));
        double b = Math.sqrt(Math.pow((cx-bx),2) + Math.pow((cy-by),2));
        double c = Math.sqrt(Math.pow((cx-ax),2) + Math.pow((cy-ay),2));

        double p = 0.5 * (a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void triangleStart(){
        System.out.println("Perimeter of triangle is ..." + String.format("%.2f",perimeter(this)));
        System.out.println("Area of triangle is..." + String.format("%.2f",area(this)));
    }
}
