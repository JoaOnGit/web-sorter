package com.sorter.websorter;

import com.sorter.websorter.sort.BubbleSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

@SpringBootApplication
public class WebSorterApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSorterApplication.class, args);

       /* try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/big-data"))) {
            String line;
            StringBuilder text = new StringBuilder();
            while ((line = br.readLine()) != null) {
                text.append(line);
            }
            System.out.println("length: " + text.length());
            String[] data = text.toString().split(",");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/test/resources/big-data"))) {
                bw.write(Arrays.toString(Arrays.stream(data)
                        .map(String::trim)
                        .toArray())
                        .replaceAll("\\[","]")
                        .replaceAll("\\]", "")
                        .replaceAll(" ", ""));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }

}
