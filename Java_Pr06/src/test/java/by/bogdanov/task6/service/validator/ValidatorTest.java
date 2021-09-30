package by.bogdanov.task6.service.validator;

import junit.framework.TestCase;
import org.junit.Assert;

public class ValidatorTest extends TestCase {
    Validator validator = new Validator();
     boolean actual = validator.isCorrect("abc");
     boolean expected = false;

     public void testValidator (){
         Assert.assertEquals(actual,expected);
     }

}