package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.entity.Oval;

public class SpecifiedById implements Specification{

    private int id;

    public SpecifiedById(int id){
        this.id = id;
    }

    @Override
    public boolean isSpecified(Oval oval) {
        return id == oval.getId();
    }
}
