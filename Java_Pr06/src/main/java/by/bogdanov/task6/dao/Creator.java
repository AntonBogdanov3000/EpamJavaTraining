package by.bogdanov.task6.dao;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;
import by.bogdanov.task6.service.ServiceException;

public class Creator {

    public Oval createOval(String text){

        Point [] points = new Point[2];
        String[] coordinates = text.split("");


        Double[] x = {Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[2])};
        Double[] y = {Double.parseDouble(coordinates[1]), Double.parseDouble(coordinates[3])};
        int id = Integer.parseInt(coordinates[4]);

        for(int i=0; i<points.length; i++){
            points[i] = new Point(x[i],y[i]);
        }
        return new Oval(id ,points[0],points[1]);
    }
}
