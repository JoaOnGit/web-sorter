package com.sorter.websorter.sort;

import org.springframework.stereotype.Service;

@Service
public abstract class AbstractSort<T extends Comparable<T>> implements Sorter<T> {
    T[] data;
    public AbstractSort(){}
    public AbstractSort(T[] data){
        this.data = data;
    }

    public void setData(T[] data){
        this.data = data;
    }

    public T[] getData(){return this.data; }

    //swap method
    public void swap(int i, int j){
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
