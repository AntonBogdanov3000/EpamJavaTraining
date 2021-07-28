package test;

import by.bogdanov.task1.Circle;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestCircle {

    private Circle circle;

    @Test
    public void trueCircleSize(){
        circle = new Circle(12,43);
        assertTrue(circle.getInner() < circle.getOuter());
    }
    @Test
    public void positiveSize(){
        circle = new Circle(10,15);
        assertTrue(circle.getInner()>0 && circle.getOuter()>0);
    }
}
