package by.bogdanov.task3.service;

import by.bogdanov.task3.bean.Array;

public interface ArrayService {

    Array bubbleSort(Array array);
    Array insertSort(Array array);
    Array shakeSort(Array array);
    Array selectionSort(Array array);
    Array createArray(int size);


}
