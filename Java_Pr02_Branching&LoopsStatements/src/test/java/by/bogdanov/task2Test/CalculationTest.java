package by.bogdanov.task2Test;


import by.bogdanov.task2.Calculation;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class CalculationTest {
    @Test
    public void testForCalculatorMethod(){
        double actual = Calculation.calculator(2,2,'+');
        double expected = 4;
        assertEquals(actual,expected);
    }
}