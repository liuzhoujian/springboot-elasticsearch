package com.lzj.springbootelasticsearch.controller;

import com.lzj.springbootelasticsearch.dao.UserDao;
import com.lzj.springbootelasticsearch.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EsController {

    @Autowired
    private UserDao userDao;

    // 添加文档
    @RequestMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity userEntity) {
        return userDao.save(userEntity);
    }

    // 查询文档
    @RequestMapping("/findById/{id}")
    public Optional<UserEntity> findById(@PathVariable("id") String id) {
        return userDao.findById(id);
    }
 }
