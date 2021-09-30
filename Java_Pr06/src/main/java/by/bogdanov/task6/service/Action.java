package by.bogdanov.task6.service;

import by.bogdanov.task6.dao.Creator;
import by.bogdanov.task6.dao.impl.FileOvalDao;
import by.bogdanov.task6.dao.repository.OvalRepository;
import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;
import by.bogdanov.task6.service.comparator.SortedById;
import by.bogdanov.task6.service.comparator.SortedByPointA;
import by.bogdanov.task6.service.validator.Validator;
import java.util.ArrayList;

public class Action {

    private final FileOvalDao reader;
    private final Creator creator;
    private final Validator validator;

    public Action(FileOvalDao reader, Creator creator, Validator validator){
        this.reader = reader;
        this.creator = creator;
        this.validator = validator;
    }
    public ArrayList<Oval> createOvalList() throws NumberFormatException{
        ArrayList<Oval> listOfOvals = new ArrayList<>();
        ArrayList<String> list = reader.getData();
        for (String data : list){
           if(validator.isCorrect(data) && !validator.isTrueSize(data)){
               Oval oval = creator.createOval(data);
               listOfOvals.add(oval);
           }
        }
        return listOfOvals;
    }

    public static void main(String[] args) {
        FileOvalDao dao = new FileOvalDao();
        Creator creator = new Creator();
        Validator v = new Validator();
        SortedById sorted = new SortedById();
        SortedByPointA pointA = new SortedByPointA();
        OvalRepository repository = OvalRepository.getOvalRepository(new Action(dao,creator,v).createOvalList());
        System.out.println(repository.getOvalList());
        repository.add(new Oval(7,new Point(4,2),new Point(2,3)));
        System.out.println(repository.getOvalList());
    }
}

