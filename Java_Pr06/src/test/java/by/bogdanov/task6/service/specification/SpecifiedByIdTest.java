package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.dao.Creator;
import by.bogdanov.task6.entity.Oval;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SpecifiedByIdTest extends TestCase {

    SpecifiedById specified = new SpecifiedById(2);
    Creator creator = new Creator();
    Oval oval = creator.createOval("30022");
    @Test
    public void test(){
        boolean actual = specified.isSpecified(oval);
        boolean excepted = true;
        Assert.assertEquals(actual,excepted);
    }
}