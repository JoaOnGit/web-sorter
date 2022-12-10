package com.sorter.websorter.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class DataReader<T> {

    @Bean
    public Integer[] readFile() {
       // List<Integer> data = new ArrayList<>();
        File file = new File("src/test/resources/testdata");
        //System.out.println(file.getAbsoluteFile());
       try(BufferedReader br = new BufferedReader(new FileReader("src/test/resources/testdata"))){
            String line, text = "";
            while((line = br.readLine()) != null){
                text = line;
            }
            String[] data = text.split(",");
            return Arrays.stream(data)
                    .map(String::trim)
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .toArray(Integer[]::new);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
