package com.sorter.websorter;

import com.sorter.websorter.sort.BubbleSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

@SpringBootApplication
public class WebSorterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSorterApplication.class, args);

        Random r = new Random(10000000);
        IntSupplier supplier = () -> r.nextInt(1000000);
        int[] data = IntStream.generate(supplier).limit(1500).toArray();

        System.out.println(Arrays.toString(data));
    }

}
