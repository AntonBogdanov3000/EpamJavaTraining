package by.bogdanov.task6.service.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.bogdanov.task6.service.ServiceException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Validator {
    public static Logger log = LogManager.getLogger(Validator.class);

    private final Pattern pattern = Pattern.compile("[0-9]+");

    public boolean isCorrect(String data){
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
    public boolean isTrueSize(String data){
        char [] c = data.toCharArray();
        if(c.length!=5){
            try {
                throw new ServiceException("Wrong data");
            }catch (ServiceException e){
                log.debug(e.getMessage());
            }
        }
        return c.length != 5;
    }


}
