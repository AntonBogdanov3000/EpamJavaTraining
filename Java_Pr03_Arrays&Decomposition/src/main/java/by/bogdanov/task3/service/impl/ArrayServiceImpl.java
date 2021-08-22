package by.bogdanov.task3.service.impl;

import by.bogdanov.task3.bean.Array;
import by.bogdanov.task3.dao.ArrayDao;
import by.bogdanov.task3.dao.factory.DaoFactory;
import by.bogdanov.task3.service.ArrayService;
import by.bogdanov.task3.viewer.Viewer;


public class ArrayServiceImpl implements ArrayService{

    @Override
    public Array bubbleSort(Array array) {
        System.out.println("Current array is " + array.toString() + "\n");
        Viewer.log.info("Bubble sort is start");

        for(int i = 0; i < array.arr.length - 1 ; i++){
            for(int j = i + 1; j < array.arr.length; j++){
                if(array.arr[i] > array.arr[j]){
                    int tmp = array.arr[i];
                    array.arr[i] = array.arr[j];
                    array.arr[j] = tmp;}
            }
        }
        return array;
    }

    @Override
    public Array insertSort(Array array){
        System.out.println("Current array is " + array.toString() + "\n");
        Viewer.log.info("Insert sort is start");

        for(int i = 1; i < array.arr.length; i++){
            for (int j = i; j > 0 && array.arr[j-1] > array.arr[j]; j--){
                int tmp = array.arr[j-1];
                array.arr[j-1] = array.arr[j];
                array.arr[j] = tmp;
            }
        }
        return array;
    }

    @Override
    public Array shakeSort(Array array){
        System.out.println("Current array is " + array.toString() + "\n");
        Viewer.log.info("Shake sort is start");

        for (int j = 0; j < array.arr.length; j++) {
            for (int i = 0; i < array.arr.length - 1; i++) {
                if (array.arr[i] > array.arr[i + 1]) {
                    int tmp = array.arr[i];
                    array.arr[i] = array.arr[i + 1];
                    array.arr[i + 1] = tmp;
                }
            }
            for (int i = array.arr.length - 1; i > 0; i--) {
                if (array.arr[i] < array.arr[i - 1]) {
                    int tmp = array.arr[i];
                    array.arr[i] = array.arr[i - 1];
                    array.arr[i - 1] = tmp;
                }
            }
        }
        return array;
    }

    @Override
    public Array selectionSort(Array array){
        System.out.println("Current array is " + array.toString() + "\n");
        Viewer.log.info("Selection sort is start");

        for(int i = 0; i < array.arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.arr.length; j++){
                if(array.arr[j] < array.arr[min]){
                    min = j;
                }
            }
            int tmp = array.arr[i];
            array.arr[i] = array.arr[min];
            array.arr[min] = tmp;
        }
        return array;
    }
    @Override
    public Array createArray(int size){
        DaoFactory dao = DaoFactory.getDaoFactory();
        ArrayDao arrayDao = dao.getArrayDao();
        return arrayDao.fillArray(new Array(size));
    }


}
