package by.bogdanov.service;

import by.bogdanov.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> readAllVehicles()throws ServiceException;
}
