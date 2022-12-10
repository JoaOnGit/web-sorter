package com.sorter.websorter;

import com.sorter.websorter.sort.AbstractSort;
import com.sorter.websorter.sort.InsertionSort;
import com.sorter.websorter.services.DataReader;
import com.sorter.websorter.sort.BubbleSort;
import com.sorter.websorter.sort.SelectionSort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebSorterApplicationTests {

    @Autowired
    DataReader<Integer> dataReader;

    @Autowired
    InsertionSort<Integer> sorter;

    @Autowired
    BubbleSort<Integer> bubbleSort;

    @Autowired
    SelectionSort<Integer> selectionSort;

    Integer[] data = new Integer[]{10, 4, 8, 2, 5, 7, 3, 6, 9, 1};

    @Test
    void contextLoads() {
    }

    @Test
    void InsertionSortTest() {
        InsertionSort<Integer> insertionSort = new InsertionSort<>(data);
        insertionSort.sort();
        assertThat(data).isSorted();
        Integer[] bigdata = dataReader.readFile();
        sorter.setData(bigdata);
        sorter.sort();
        assertThat(bigdata).isSorted();
    }

    @Test
    void SelectionSortTest() {
        selectionSort.setData(data);
        selectionSort.sort();
        assertThat(data).isSorted();
        Integer[] bigdata = dataReader.readFile();
        selectionSort.setData(bigdata);
        selectionSort.sort();
        assertThat(bigdata).isSorted();
    }

    @Test
    void bubbleSortTest() {
        bubbleSort.setData(data);
        bubbleSort.sort();
        assertThat(data).isSorted();
        Integer[] bigdata = dataReader.readFile();
        bubbleSort.setData(bigdata);
        bubbleSort.sort();
        assertThat(bigdata).isSorted();
    }

}
