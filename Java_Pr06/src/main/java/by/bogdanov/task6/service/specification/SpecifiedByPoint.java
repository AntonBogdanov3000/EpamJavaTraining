package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;

public class SpecifiedByPoint implements Specification {

    private Point point;

    public SpecifiedByPoint(Point point){
        setPoint(point);
    }
    private void setPoint(Point point){
        this.point = point;
    }

    @Override
    public boolean isSpecified(Oval oval)  {
        return point.equals(oval.getPointA()) || point.equals(oval.getPointB());
    }

}
