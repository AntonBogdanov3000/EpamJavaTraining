package test.task2;
import by.bogdanov.task2.Calculation;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalculationTest {

    @Test
    public void testForCalculatorMethod(){
        Calculation.calculator(2,2,'+');
        double actual = Calculation.calculator(2,2,'+');
        double expected = 4;
        assertEquals(actual,expected);
    }
}

