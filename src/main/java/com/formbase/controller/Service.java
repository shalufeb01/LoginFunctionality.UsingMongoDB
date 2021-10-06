package com.formbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {


@Autowired
 private MongoTemplate mongoTemplate;

    public User getUser(User user){

    Query query = new Query();
    query.addCriteria(Criteria.where("name").is(user.getName()));
       User user1 = mongoTemplate.findOne(query,User.class);
       return user1;
    }
}
