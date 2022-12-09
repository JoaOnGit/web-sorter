package com.sorter.websorter.sort;

import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T> {

    public SelectionSort(T[] data) {
        super(data);
    }

    @Override
    public void sort() {
        selectionSort();
    }

    private void selectionSort() {
        IntStream.range(0, data.length).forEach(i -> {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[minIndex].compareTo(data[j]) > 0) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        });
    }
}
/*
 [6, 2, 5, 1, 3]
 [

 */