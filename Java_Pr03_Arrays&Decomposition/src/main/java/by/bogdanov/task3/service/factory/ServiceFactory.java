package by.bogdanov.task3.service.factory;
import by.bogdanov.task3.service.ArrayService;
import by.bogdanov.task3.service.MatrixService;
import by.bogdanov.task3.service.impl.ArrayServiceImpl;
import by.bogdanov.task3.service.impl.MatrixServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory serviceFactory = new ServiceFactory();
    private final ArrayService arrayService = new ArrayServiceImpl();
    private final MatrixService matrixService = new MatrixServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getServiceFactory(){
        return serviceFactory;
    }
    public ArrayService getArrayService(){
        return arrayService;
    }
    public MatrixService getMatrixService(){
        return matrixService;
    }
}
