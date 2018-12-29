package com.lzj.springbootelasticsearch.dao;

import com.lzj.springbootelasticsearch.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserEntity, String> {
}
