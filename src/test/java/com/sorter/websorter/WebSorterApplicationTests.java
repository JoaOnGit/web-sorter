package com.sorter.websorter;

import com.sorter.websorter.sort.BubbleSort;
import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebSorterApplicationTests {

	Integer[] data = new Integer[]{10, 5, 3, 2, 1, 6, 4, 7, 8, 9};
	@Test
	void contextLoads() {
	}

	@Test
	void BubbleSortTest(){

		BubbleSort<Integer> bubbleSort = new BubbleSort<>(data);
		bubbleSort.sort();
		assertThat(data).isSorted();
	}

}
