package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.dao.Creator;
import by.bogdanov.task6.service.ServiceException;
import by.bogdanov.task6.service.validator.Validator;
import by.bogdanov.task6.dao.impl.FileOvalDao;
import by.bogdanov.task6.dao.repository.OvalRepository;
import by.bogdanov.task6.service.Action;
import by.bogdanov.task6.service.comparator.SortedById;
import junit.framework.TestCase;
import org.junit.Test;

public class IdSortTest extends TestCase{

    FileOvalDao dao = new FileOvalDao();
    Creator creator = new Creator();
    Validator v = new Validator();
    SortedById sorted = new SortedById();

@Test
    public void sortId(){
        try{
            OvalRepository repository = OvalRepository.getOvalRepository(new Action(dao,creator,v).createOvalList());
           repository.getOvalList().sort(sorted);
            System.out.println(repository.getOvalList());}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

}
