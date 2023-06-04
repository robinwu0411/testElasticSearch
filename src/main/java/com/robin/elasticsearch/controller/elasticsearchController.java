package com.robin.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.erhlc.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("es")
public class elasticsearchController {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @PostMapping("addOne")
    public void save() {

    }
}
