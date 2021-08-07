package test.task1;

import by.bogdanov.task1.Ring;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestCircle {

    private Ring circle;
//TODO: add description
    @Test
    public void trueCircleSize(){
        circle = new Ring(12,43);
        assertTrue(circle.getInner() < circle.getOuter());
    }
    @Test
    public void positiveSize(){
        circle = new Ring(10,15);
        assertTrue(circle.getInner()>0 && circle.getOuter()>0);
    }
}
