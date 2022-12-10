package com.sorter.websorter.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class DataReader<T> {

    public Integer[] readFile(String url) {
       // List<Integer> data = new ArrayList<>();
        File file = new File("src/test/resources/big-data");
        //System.out.println(file.getAbsoluteFile());
       try(BufferedReader br = new BufferedReader(new FileReader("src/test/resources/"+url))){
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
