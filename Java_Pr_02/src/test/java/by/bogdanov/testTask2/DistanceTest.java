package by.bogdanov.testTask2;

import by.bogdanov.task02.Distance;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DistanceTest {
    @Test
    public void distance(){
        String actual = Distance.distanceToEntry(new Distance.Point(0,0),new Distance.Point(1,2),new Distance.Point(4,5));
        String expected = "A is closer to start of coordinates";
        assertEquals(actual,expected);
    }
}
