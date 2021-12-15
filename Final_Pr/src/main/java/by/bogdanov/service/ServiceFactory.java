package by.bogdanov.service;

import by.bogdanov.service.impl.ConnectionServiceImpl;
import by.bogdanov.service.impl.UserServiceImpl;
import by.bogdanov.service.impl.VehicleServiceImpl;

public final class ServiceFactory {

    private final static ServiceFactory instance = new ServiceFactory();
    private final UserService userService = new UserServiceImpl();
    private final VehicleService vehicleService = new VehicleServiceImpl();
    private final ConnectionService connectionService = new ConnectionServiceImpl();

    public static ServiceFactory getInstance(){
        return instance;
    }
    public UserService getUserService(){
        return userService;
    }
    public VehicleService getVehicleService(){
        return vehicleService;
    }
    public ConnectionService getConnectionService() {
        return connectionService;
    }

}
