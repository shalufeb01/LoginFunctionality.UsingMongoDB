package com.formbase.controller;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<User,String> {


    @Override
    List<User> findAll(Sort sort);

    @Override
    <S extends User> S save(S entity);
}
