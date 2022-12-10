package com.sorter.websorter;

import com.sorter.websorter.sort.InsertionSort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebSorterApplicationTests {

	Integer[] data = new Integer[]{10, 5, 7, 3, 9, 2, 8, 1, 6, 4};
	@Test
	void contextLoads() {
	}

	@Test
	void InsertionSortTest(){
		InsertionSort<Integer> insertionSort = new InsertionSort<>(data);
		insertionSort.sort();
		assertThat(data).isSorted();
	}


}
