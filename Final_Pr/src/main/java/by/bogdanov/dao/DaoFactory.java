package by.bogdanov.dao;

import by.bogdanov.dao.mysql.*;

public class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();

    private final UserDao userDaoImpl = new UserDaoImpl();
    private final VehicleDao vehicleDaoImpl = new VehicleDaoImpl();
    private final OrderDao orderDaoImpl = new OrderDaoImpl();
    private final OperationDao operationDaoImpl = new OperationDaoImpl();
    private final ManagerDao managerDaoImpl = new ManagerDaoImpl();
    private final ClearanceDao clearanceDaoImpl = new ClearanceDaoImpl();

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return instance;
    }
    public UserDao getUserDao(){
        return userDaoImpl;
    }
    public VehicleDao getVehicleDao(){
        return vehicleDaoImpl;
    }
    public OrderDao getOrderDao(){
        return orderDaoImpl;
    }
    public OperationDao getOperationDao(){
        return operationDaoImpl;
    }
    public ManagerDao getManagerDao(){
        return managerDaoImpl;
    }
    public ClearanceDao getClearanceDao(){
        return clearanceDaoImpl;
    }

}
