package by.bogdanov.task3.bean;

import java.util.Arrays;

public class Array {
    public int [] arr;

    public Array(int sizeOfArr){
        this.arr = new int[sizeOfArr];
    }


@Override
    public String toString(){
    return Arrays.toString(this.arr);
}
@Override
    public boolean equals(Object obj){
    return obj == this;
}
    }



