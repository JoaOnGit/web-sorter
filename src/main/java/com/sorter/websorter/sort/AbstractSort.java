package com.sorter.websorter.sort;

public abstract class AbstractSort<T extends Comparable<T>> implements Sorter<T> {
    T[] data;

    public AbstractSort(T[] data){
        this.data = data;
    }

    //swap method
    public void swap(int i, int j){
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
