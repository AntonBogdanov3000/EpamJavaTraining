package by.bogdanov.service;

import by.bogdanov.service.impl.*;

public final class ServiceFactory {

    private final static ServiceFactory instance = new ServiceFactory();
    private final UserService userService = new UserServiceImpl();
    private final VehicleService vehicleService = new VehicleServiceImpl();
    private final OrderService orderService = new OrderServiceImpl();
    private final OperationService operationService = new OperationServiceImpl();
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
    public OrderService getOrderService(){
        return orderService;
    }
    public OperationService getOperationService(){
        return operationService;
    }
    public ConnectionService getConnectionService() {
        return connectionService;
    }


}
