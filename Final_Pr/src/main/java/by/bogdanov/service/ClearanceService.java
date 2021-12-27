package by.bogdanov.service;

import by.bogdanov.entity.Clearance;
import by.bogdanov.service.Service;

import java.util.List;

public interface ClearanceService extends Service {

Clearance getClearanceById(int id) throws ServiceException;
List<Clearance> getAllClearance() throws ServiceException;
}
