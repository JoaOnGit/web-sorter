package com.sorter.websorter.web;

import com.sorter.websorter.model.ResponseModel;
import com.sorter.websorter.service.SortingService;
import com.sorter.websorter.sort.QuickSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("sort/v1")
public class SortController<T extends Comparable<T>> {

    @Autowired
    SortingService<T> sortingService;

    @GetMapping(value = "{data}")
    public ResponseModel sortData(@PathVariable("data") String dataReq){
        return sortingService.respond(dataReq);
    }
}
