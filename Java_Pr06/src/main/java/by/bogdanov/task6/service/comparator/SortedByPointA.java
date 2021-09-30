package by.bogdanov.task6.service.comparator;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;

import java.util.Comparator;

public class SortedByPointA implements Comparator<Oval> {
    @Override
    public int compare(Oval o1, Oval o2) {

        Point o1PointA = o1.getPointA();
        Point o2PointA = o2.getPointA();
        return o1PointA.getX() < o2PointA.getX() ? -1: o1PointA.getX() == o2PointA.getX() ? 0:1;
    }
}
