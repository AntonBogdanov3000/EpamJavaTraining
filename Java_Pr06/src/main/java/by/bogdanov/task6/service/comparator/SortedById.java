package by.bogdanov.task6.service.comparator;

import by.bogdanov.task6.entity.Oval;

import java.util.Comparator;

public class SortedById implements Comparator<Oval> {

    @Override
    public int compare(Oval o1, Oval o2) {

        int idOne = o1.getId();
        int idTwo = o2.getId();
        
        return idOne < idTwo ? -1: idOne == idTwo ? 0 : 1;
    }
}
