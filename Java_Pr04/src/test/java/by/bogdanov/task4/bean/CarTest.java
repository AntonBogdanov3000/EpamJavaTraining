package by.bogdanov.task4.bean;

import junit.framework.TestCase;
import org.junit.Assert;

public class CarTest extends TestCase {

    public void testGetVehicle() {
        Car car = new Car();
        car.setManufacturer("Audi");
        car.setModel("TT");
        String actual = car.getVehicle();
        String expected = "Audi TT";
        Assert.assertEquals(expected,actual);
    }

}