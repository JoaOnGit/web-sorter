package com.sorter.websorter;

import com.sorter.websorter.sort.SelectionSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class WebSorterApplicationTests {

	
	Integer[] data = new Integer[]{10, 4, 8, 2, 5, 7, 3, 6, 9, 1};
	@Test
	void contextLoads() {
	}

	@Test
	void SelectionSortTest(){
		SelectionSort<Integer> selectionSort = new SelectionSort<>(data);
		selectionSort.sort();
		assertThat(data).isSorted();
	}

}
