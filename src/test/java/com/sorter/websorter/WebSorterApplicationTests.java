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

	Integer[] data = new Integer[]{10, 4, 8, 2, 5, 7, 3, 6, 9, 1, 11, 45, 32, 90, 33, 2, 60, 22, 18, 20, 13, 27};
	
  @Test
	void contextLoads() {
	}

    void sortIntegerTest(AbstractSort<Integer> sort){
      sort.setData(data);
      sort.sort();
      assertThat(sort.getData()).isSorted();
    }

	@Test
	void QuickSortTest(){
		quickSort.setData(data);
        sortIntegerTest(quickSort);
        //Big Data Test
        quickSort.setData(dataReader.readFile());
        sortIntegerTest(quickSort);
	}
   

    @Test
    void InsertionSortTest() {
        insertionSort.setData(data);
        sortIntegerTest(insertionSort);
        //Big Data Test
        insertionSort.setData(dataReader.readFile());
        sortIntegerTest(insertionSort);
    }

    @Test
    void SelectionSortTest() {
        selectionSort.setData(data);
        sortIntegerTest(selectionSort);
        //Big Data Test
        selectionSort.setData(dataReader.readFile());
        sortIntegerTest(selectionSort);
    }

	@Test
	void MergeSortTest(){
        mergeSort.setData(data);
        sortIntegerTest(mergeSort);
        //Big Data Test
        mergeSort.setData(dataReader.readFile());
        sortIntegerTest(mergeSort);
	}
    @Test
    void bubbleSortTest() {
        bubbleSort.setData(data);
        sortIntegerTest(bubbleSort);
        //Big Data Test
        bubbleSort.setData(dataReader.readFile());
        sortIntegerTest(bubbleSort);
    }

}
