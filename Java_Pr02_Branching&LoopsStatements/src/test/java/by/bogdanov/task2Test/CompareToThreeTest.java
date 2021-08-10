package by.bogdanov.task2Test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import by.bogdanov.task2.Compare;

public class CompareToThreeTest {
    @Test
    public void compareWithZero(){
        Compare.compareNumber(0);
        String actual = Compare.compareNumber(0);
        String expected = "Yes";
        assertEquals(actual,expected);
    }
}
