package by.bogdanov.service;

import by.bogdanov.entity.Operation;
import java.util.List;

public interface OperationService extends Service{
    List<Operation> readAllOperations() throws ServiceException;
}
