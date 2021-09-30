package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.dao.Creator;
import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;
import by.bogdanov.task6.service.ServiceException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SpecifiedByPointTest  extends TestCase  {
    Point point = new Point(3,0);
    SpecifiedByPoint specified = new SpecifiedByPoint(point);
    Creator creator = new Creator();
    Oval oval = creator.createOval("30021");
@Test
    public void test() {
       boolean actual = specified.isSpecified(oval);
       boolean expected = true;
       Assert.assertEquals(actual,expected);
    }

}
