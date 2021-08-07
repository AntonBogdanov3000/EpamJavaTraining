package test.task1;

import by.bogdanov.task1.Function;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestFunction {


    private Function function;

    @DataProvider(name = "Positive")
    public Object[][] positiveNumbers(){
        return new Object[][]{
                {new int[]{1,2},2},
                {new int[]{112,205},1239},
                {new int[]{34,0}}
        };
    }
    @DataProvider(name = "Negative_in")
    public Object[][] negativeNumbers(){
        return new Object[][]{
                {new int[]{-1, -2},-22},
                {new int[]{-14,-17},-123},
                {new int[]{-75,0},-160}
        };
    }

    @Test(dataProvider = "Positive")
    public void testOfFunctionWithPositive(int []ab, int c){
        function = new Function(ab[0],ab[1]);
        double actual = function.returnFunc();
        int expected = c;
        assertEquals(actual, expected);
    }
    @Test(dataProvider = "Negative_in")
    public void testOfFunctionWithNegative(int []ab, int c){
        function = new Function(ab[0], ab[1]);
        double actual = function.returnFunc();
        int expected = c;
        assertEquals(actual, expected);
    }
    @AfterTest
    public void after(){
        System.out.println("Tests Finished");
    }
}
