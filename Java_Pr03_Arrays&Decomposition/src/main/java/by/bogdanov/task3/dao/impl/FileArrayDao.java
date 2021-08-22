package by.bogdanov.task3.dao.impl;

import by.bogdanov.task3.bean.Array;
import by.bogdanov.task3.dao.ArrayDao;


public class FileArrayDao implements ArrayDao{

    @Override
    public Array fillArray(Array array){
        for (int i=0; i < array.arr.length; i++){
            array.arr[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}
