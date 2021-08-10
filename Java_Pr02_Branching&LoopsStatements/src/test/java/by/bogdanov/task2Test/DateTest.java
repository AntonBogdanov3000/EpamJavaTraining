package by.bogdanov.task2Test;

import by.bogdanov.task2.Dat;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DateTest {
    @Test
    public void incorrectEnter(){
        String actual = Dat.enterCorrectDate(-2,0);
        String expected = "Incorrect date";
        assertEquals(actual,expected);
    }
}
