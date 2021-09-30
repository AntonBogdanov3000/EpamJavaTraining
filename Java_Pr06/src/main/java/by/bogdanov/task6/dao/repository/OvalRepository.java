package by.bogdanov.task6.dao.repository;

import by.bogdanov.task6.entity.Oval;
import java.util.ArrayList;

public class OvalRepository implements Repository{

    private static OvalRepository ovalRepository;
    private ArrayList<Oval> ovalList;

    private OvalRepository(ArrayList<Oval> list){
        this.ovalList = list;
    }
    public static OvalRepository getOvalRepository(ArrayList<Oval> list){
        if(ovalRepository == null){
            ovalRepository = new OvalRepository(list);
        }
        return ovalRepository;
    }
    public ArrayList<Oval> getOvalList(){
        return ovalList;
    }

    @Override
    public void add(Oval oval){
        ovalList.add(oval);
    }

    @Override
    public void update(Oval oval) {

    }

    @Override
    public void remove(Oval oval) {
        ovalList.remove(oval);
    }

}
