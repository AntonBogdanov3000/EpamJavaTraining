package by.bogdanov.service.impl;

import by.bogdanov.dao.DaoEnum;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.TransactionFactory;
import by.bogdanov.dao.VehicleDao;
import by.bogdanov.dao.mysql.TransactionFactoryImpl;
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
}
