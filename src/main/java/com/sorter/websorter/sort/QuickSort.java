package com.sorter.websorter.sort;

import org.springframework.stereotype.Service;

@Service
public class QuickSort<T extends Comparable<T>> extends AbstractSort<T> {

    public QuickSort(T[] data){
        super(data);
    }

    @Override
    public void sort() {
        quicksort(0, data.length-1);
    }

    private void quicksort(int left, int right){
        if(left >= right) return;
        T midIndexValue = data[left + ((right - left) / 2)];
        int pivot = partition(left, right, midIndexValue);
        quicksort(left, pivot - 1);
        quicksort(pivot, right);
    }

    private int partition(int left, int right, T midIndex) {
        while(left <= right){
            while(data[left].compareTo(midIndex) < 0) left++;
            while(data[right].compareTo(midIndex) > 0) right--;
            if(left <= right){
                swap(left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}