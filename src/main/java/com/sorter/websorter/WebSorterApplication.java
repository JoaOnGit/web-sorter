package com.sorter.websorter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class WebSorterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSorterApplication.class, args);

        File file = new File("src/test/resources/testdata");
        System.out.println(file.getAbsoluteFile());
    }

}
