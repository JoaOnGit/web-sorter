package com.sorter.websorter.sort;

import org.springframework.stereotype.Service;

@Service
public class MergeSort<T extends  Comparable<T>> extends AbstractSort<T> {

    public MergeSort(T[] data){
        super(data);
    }

    @Override
    public void sort() {
        mergesort(data);
    }

    private void mergesort(T[] data){
        int size = data.length;;
        if(size < 2) return;
        int mid = size / 2;
        T[] leftArray = (T[]) new Comparable[mid];
        T[] rightArray = (T[]) new Comparable[size - mid];
        System.arraycopy(data, 0, leftArray, 0, leftArray.length);
        System.arraycopy(data, mid, rightArray, 0, rightArray.length);
        mergesort(leftArray);
        mergesort(rightArray);
        merge(data, leftArray, rightArray);
    }

    private void merge(T[] data, T[] left, T[] right){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length) {
            data[k++] = left[i].compareTo(right[j]) < 0 ? left[i++] : right[j++];
        }
        while(i < left.length) data[k++] = left[i++];
        while(j < right.length) data[k++] = right[j++];
    }
}