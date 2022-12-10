package com.sorter.websorter;

import com.sorter.websorter.sort.InsertionSort;
import com.sorter.websorter.services.DataReader;
import com.sorter.websorter.sort.BubbleSort;
import com.sorter.websorter.sort.SelectionSort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebSorterApplicationTests {

	@Autowired
	DataReader<Integer> dataReader;

	Integer[] data = new Integer[]{10, 4, 8, 2, 5, 7, 3, 6, 9, 1};

  @Test
	void contextLoads() {
	}

	@Test
	void InsertionSortTest(){
		InsertionSort<Integer> insertionSort = new InsertionSort<>(data);
		insertionSort.sort();
		assertThat(data).isSorted();
	}

  @Test
	void SelectionSortTest(){
		SelectionSort<Integer> selectionSort = new SelectionSort<>(data);
		selectionSort.sort();
		assertThat(data).isSorted();
		Integer[] bigdata = dataReader.readFile();
		SelectionSort<Integer> selectionSort1 = new SelectionSort<>(bigdata);
		selectionSort1.sort();
		assertThat(bigdata).isSorted();
	}

	@Test
	void bubbleSortTest(){
		BubbleSort<Integer> bubbleSort = new BubbleSort<>(data);
		bubbleSort.sort();
		assertThat(data).isSorted();
		Integer[] bigdata = dataReader.readFile();
		BubbleSort<Integer> bubbleSort1 = new BubbleSort<>(bigdata);
		bubbleSort1.sort();
		assertThat(bigdata).isSorted();
	}

}
