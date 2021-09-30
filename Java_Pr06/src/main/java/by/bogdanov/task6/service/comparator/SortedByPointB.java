package by.bogdanov.task6.service.comparator;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;

import java.util.Comparator;

public class SortedByPointB implements Comparator<Oval> {
    @Override
    public int compare(Oval o1, Oval o2) {

        Point o1PointB = o1.getPointB();
        Point o2PointB = o2.getPointB();

        return o1PointB.getY() < o2PointB.getY() ? -1 : o1PointB.getY() == o2PointB.getY() ? 0:1;
    }
}
