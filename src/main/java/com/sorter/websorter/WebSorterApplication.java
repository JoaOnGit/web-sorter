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
    }

}
