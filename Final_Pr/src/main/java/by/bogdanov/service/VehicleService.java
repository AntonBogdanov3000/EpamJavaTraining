package by.bogdanov.service;

import by.bogdanov.entity.Vehicle;

import java.util.List;

public interface VehicleService extends Service{
    List<Vehicle> readAllVehicles()throws ServiceException;
}
