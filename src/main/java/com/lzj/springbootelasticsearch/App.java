package com.lzj.springbootelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.lzj.springbootelasticsearch.dao")//扫描userDao
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}

