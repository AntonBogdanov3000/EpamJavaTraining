package by.bogdanov.service.impl;

import by.bogdanov.dao.*;
import by.bogdanov.dao.mysql.TransactionFactoryImpl;
import by.bogdanov.entity.User;
import by.bogdanov.entity.Vehicle;
import by.bogdanov.service.ServiceException;
import by.bogdanov.service.VehicleService;
import java.util.ArrayList;
import java.util.List;

public class VehicleServiceImpl extends ServiceImpl implements VehicleService {

    @Override
    public List<Vehicle> readAllVehicles() throws ServiceException {
        List<Vehicle> vehicleList = new ArrayList<>();
        try{
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            VehicleDao vehicleDao = transaction.createDao(DaoEnum.VEHICLE_DAO);
            vehicleList.addAll(vehicleDao.readAll());
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return vehicleList;
    }

    @Override
    public List<Vehicle> readVehicleByUserId(int id) throws ServiceException {
        List<Vehicle> vehicleList = new ArrayList<>();
        List<Vehicle> result = new ArrayList<>();
        User user = new User();
        try{
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            VehicleDao vehicleDao = transaction.createDao(DaoEnum.VEHICLE_DAO);
            UserDao userDao = transaction.createDao(DaoEnum.USER_DAO);
            user = userDao.readById(id);
            vehicleList = vehicleDao.readAll();
            for(Vehicle car : vehicleList){
                if(car.getOwnerId() == user.getId()){
                    result.add(car);
                }
            }
        }catch (DaoException e){
            throw new ServiceException(e);
        }
        return result;
    }

    @Override
    public void createVehicle(Vehicle vehicle) throws ServiceException {
        try{
            TransactionFactory factory = new TransactionFactoryImpl();
            transaction = factory.createTransaction();
            VehicleDao vehicleDao = transaction.createDao(DaoEnum.VEHICLE_DAO);
            vehicleDao.create(vehicle);
        }catch (DaoException e){
            throw new ServiceException(e);
        }
    }
}
