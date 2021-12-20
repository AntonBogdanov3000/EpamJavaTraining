package by.bogdanov.service;

import by.bogdanov.entity.Vehicle;

import java.util.List;

public interface VehicleService extends Service{
    List<Vehicle> readAllVehicles()throws ServiceException;
    List<Vehicle> readVehicleByUserId(int id)throws ServiceException;
    void createVehicle(Vehicle vehicle) throws ServiceException;
}
