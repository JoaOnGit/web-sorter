package com.sorter.websorter.sort;

public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T>{

    public BubbleSort(T[] data){
        super(data);
    }

    private void bubblesort(){
        for(int i = 0; i < data.length; i++){
            for(int j = i+1; j < data.length; j++){
                if(data[i].compareTo(data[j]) > 0){
                    swap(i, j);
                }
            }
        }
    }

    @Override
    public void sort() {
        bubblesort();
    }
}

