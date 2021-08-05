package test.task1;

import by.bogdanov.task1.Radians;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestRadians {
    private Radians radians;


    @Test
    public void testOutDegrees(){
        radians = new Radians(1);
        double actual = radians.degrees();
        double expected = radians.degrees();
        assertEquals(actual, expected);
    }
    @Test
    public void testOutMinutes(){
        radians = new Radians(1);
        double actual = radians.minutes();
        double expected = radians.minutes(); ;
        assertEquals(actual, expected);
    }
    @Test
    public void testOutSeconds(){
        radians = new Radians(1);
        double actual = radians.seconds();
        double expected = radians.seconds();
        assertEquals(actual,expected);
    }
}
