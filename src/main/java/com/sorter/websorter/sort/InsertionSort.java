package com.sorter.websorter.sort;

import org.springframework.stereotype.Service;

@Service
public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T>{

    public InsertionSort(T[] data){
        super(data);
    }

    private void insertionSort(){
        for(int i = 1; i < data.length; i++){
            int j = i;
            while(j > 0 && data[j].compareTo(data[j-1]) < 0){
                swap(j, j-1);
                j--;
            }
        }
    }

    @Override
    public void sort() {
        insertionSort();
    }

}
