package number_13;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point a = new Point(3,7);
        Point b = new Point(12,18);
        Point c = new Point(21,27);

        System.out.printf("%.2f",perimeter(a,b,c));

    }
    public static double perimeter(Point a, Point b, Point c){
        double ab = (b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y);
        double bc = (c.x - b.x) * (c.x - b.x) + (c.y - b.y) * (c.y - b.y);
        double ca = (a.x - c.x) * (a.x - c.x) + (a.y - c.y) * (a.y - c.y);
        return Math.sqrt(ab) + Math.sqrt(bc) + Math.sqrt(ca);
    }
}
