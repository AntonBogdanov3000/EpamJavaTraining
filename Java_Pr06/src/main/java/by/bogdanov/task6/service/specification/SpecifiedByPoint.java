package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.dao.Creator;
import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;
import by.bogdanov.task6.service.ServiceException;
import by.bogdanov.task6.service.specification.Specification;

public class SpecifiedByPoint implements Specification {

    private Point point;

    public SpecifiedByPoint(Point point){
        setPoint(point);
    }
    private void setPoint(Point point){
        this.point = point;
    }
    public Point getPoint(){
        return point;
    }

    @Override
    public boolean isSpecified(Oval oval)  {
        return point.equals(oval.getPointA());
    }

}
