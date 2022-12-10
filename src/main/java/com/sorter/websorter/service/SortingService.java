package com.sorter.websorter.service;

import com.sorter.websorter.model.ResponseModel;
import com.sorter.websorter.sort.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Selection;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class SortingService<T extends Comparable<T>> {

    @Autowired
    QuickSort<T> quickSort;

    @Autowired
    MergeSort<T> mergeSort;

    @Autowired
    BubbleSort<T> bubbleSort;

    @Autowired
    SelectionSort<T> selectionSort;

    @Autowired
    InsertionSort<T> insertionSort;

    private AbstractSort<T> selectSorter(T[] data){
        int len = data.length;;
        if(len <= 100) return bubbleSort;
        else if(len <= 500) return selectionSort;
        else if(len <= 800) return insertionSort;
        else if(len <= 1_000) return mergeSort;
        else return quickSort;
    }

    public ResponseModel respond(String dataReq){
        T[] data = (T[]) dataReq.split(",");
        AbstractSort<T> sorter = selectSorter(data);
        sorter.setData(data);
        long start = System.nanoTime();
        //System.out.println("start: "+start);
        sorter.sort();
        double timeUsed = (System.nanoTime() - start) / 1_000_000.00;
        return ResponseModel.builder()
                .speed(String.format("%.4f ms", timeUsed))
                .algorithm(sorter.getClass().getSimpleName())
                .sorted(Arrays.toString(sorter.getData()))
                .build();
    }


}
