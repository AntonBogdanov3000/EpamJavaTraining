package by.bogdanov.task6.service.specification;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.service.ServiceException;

public interface Specification {
    public boolean isSpecified(Oval oval) throws ServiceException;
}
