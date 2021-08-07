package by.bogdanov.task1;


import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public  class  FigureArea {
    private final static Logger log = LogManager.getLogger(FigureArea.class);
    Point[] points;
    public FigureArea(Point[] area){
        this.points = area;
    }


    public static void equiv(FigureArea figureArea , Point point){
        String result = null;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<figureArea.points.length;i++){
            if(figureArea.points[i].x == point.x && figureArea.points[i].y == point.y){
                result = "True";
            }
            list.add(result);}
        System.out.println(list.contains("True"));

    }
    public static Point[] createOne(){
        log.info("Figure created");
        Point[] figure = new Point[18];
        figure[0] = new Point(0,1);
        figure[1] = new Point(0,2);
        figure[2] = new Point(0,3);
        figure[3] = new Point(0,4);
        figure[4] = new Point(1,1);
        figure[5] = new Point(1,2);
        figure[6] = new Point(1,3);
        figure[7] = new Point(2,1);
        figure[8] = new Point(2,2);
        figure[9] = new Point(3,1);
        figure[10] = new Point(4,0);
        figure[11] = new Point(-1,1);
        figure[12] = new Point(-1,2);
        figure[13] = new Point(-1,3);
        figure[14] = new Point(-2,1);
        figure[15] = new Point(-2,2);
        figure[16] = new Point(-3,1);
        figure[17] = new Point(-4,0);
        return figure;
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
