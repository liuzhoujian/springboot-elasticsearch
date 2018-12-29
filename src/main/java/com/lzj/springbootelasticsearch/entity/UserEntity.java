package com.lzj.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "myindex", type = "user") //索引 类型
@Data //可以不用写getter setter
public class UserEntity {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Integer sex;
}
