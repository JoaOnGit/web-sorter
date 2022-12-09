package com.sorter.websorter;

import com.sorter.websorter.services.DataReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebSorterApplicationTests {

	@Autowired
	DataReader<Integer> dataReader;
	@Test
	void contextLoads() {
	}

	@Test
	void FileReadTest(){
		Integer[] data = dataReader.readFile();
		//System.out.println(Arrays.toString(data));
		assertThat(data).isNotEmpty();
	}

}
