package by.bogdanov.task5.service.factory;

import by.bogdanov.task5.bean.MatrixThread;

public class ServiceFactory {

    private static final ServiceFactory serviceFactory = new ServiceFactory();
    private final MatrixThread matrixThread = new MatrixThread();

   public static ServiceFactory getServiceFactory(){
       return serviceFactory;
   }
   public MatrixThread getMatrixThread(){
       return matrixThread;
   }
}
