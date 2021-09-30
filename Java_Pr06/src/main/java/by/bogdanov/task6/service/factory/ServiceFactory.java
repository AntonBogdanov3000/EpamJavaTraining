package by.bogdanov.task6.service.factory;

import by.bogdanov.task6.service.OvalService;
import by.bogdanov.task6.service.impl.OvalServiceImpl;

public class ServiceFactory {

 private static ServiceFactory serviceFactory = new ServiceFactory();
 private final OvalService ovalService = new OvalServiceImpl();

public static ServiceFactory getServiceFactory(){
    return serviceFactory;
}
public OvalService getOvalService(){
    return ovalService;
}
}
