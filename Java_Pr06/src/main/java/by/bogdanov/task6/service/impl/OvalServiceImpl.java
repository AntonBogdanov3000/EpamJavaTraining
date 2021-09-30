package by.bogdanov.task6.service.impl;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;
import by.bogdanov.task6.service.OvalService;


public class OvalServiceImpl implements OvalService {

    /**
     * Находим площадь овала
     */
    @Override
    public double getArea(Oval oval) {
        double lengthA = getLengthA(oval);
        double lengthB = getLengthB(oval);

        return Math.PI * lengthA * lengthB;
    }

    /**
     * Находим периметр овала
     */
    @Override
    public double getPerimeter(Oval oval) {
        double lengthA = getLengthA(oval);
        double lengthB = getLengthB(oval);

        return 2 * Math.PI * Math.sqrt((((lengthA * lengthA) + (lengthB * lengthB)) / 2));
    }

    @Override
    public boolean isOval(Oval oval) {
        return getLengthA(oval) != getLengthB(oval);
    }

    @Override
    public boolean isCircle(Oval oval) {
        return getLengthA(oval) == getLengthB(oval);
    }

    /**
     * Находим точку-центр
     */
     private Point getCenterPoint(Oval oval) {
        Point x = oval.getPointA();
        Point y = oval.getPointB();
        Point center = new Point(y.getX(), x.getY());
        return center;
    }

    /**
     *  Получаем длину большой полуоси
     */
    public double getLengthA(Oval oval) {
        Point center = getCenterPoint(oval);
        Point x = oval.getPointA();
        return Math.abs(x.getX() - center.getX());
    }

    /**
     * Получаем длину малой полуоси
     */

    public double getLengthB(Oval oval) {
        Point center = getCenterPoint(oval);
        Point y = oval.getPointB();
        return Math.abs(y.getY() - center.getX());
    }
}
