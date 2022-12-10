package com.sorter.websorter;

import com.sorter.websorter.sort.*;
import com.sorter.websorter.utility.DataReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

@SpringBootTest
class WebSorterApplicationTests {
    static final String SMALL_DATA = "small-data";
    static final String BIG_DATA = "big-data";
    @Autowired
    DataReader<Integer> dataReader;
    @Autowired
    InsertionSort<Integer> insertionSort;
    @Autowired
    BubbleSort<Integer> bubbleSort;
    @Autowired
    SelectionSort<Integer> selectionSort;
    @Autowired
    QuickSort<Integer> quickSort;
    @Autowired
    MergeSort<Integer> mergeSort;

    void sortIntegerTest(AbstractSort<Integer> sort) {
        sort.setData(dataReader.readFile(SMALL_DATA));
        sort.sort();
        assertThat(sort.getData()).isSorted();
        //Big Data Test
        sort.setData(dataReader.readFile(BIG_DATA));
        sort.sort();
        assertThat(sort.getData()).isSorted();
    }

    @Test
    void QuickSortTest() {
        sortIntegerTest(quickSort);
    }

    @Test
    void MergeSortTest() {
        sortIntegerTest(mergeSort);
    }

    @Test
    void InsertionSortTest() {
        sortIntegerTest(insertionSort);
    }

    @Test
    void SelectionSortTest() {
        sortIntegerTest(selectionSort);
    }

    @Test
    void bubbleSortTest() {
        sortIntegerTest(bubbleSort);
    }

}
