package by.bogdanov.testTask2;
import by.bogdanov.task02.Calculation;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculationTest {

    @Test
    public void testForCalculatorMethod(){
        Calculation.calculator(2,2,'+');
        double actual = Calculation.calculator(2,2,'+');
        double expected = 4;
        assertEquals(actual,expected);
    }
}

