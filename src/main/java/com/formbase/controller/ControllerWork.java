package com.formbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerWork {

   private User user1;

@Autowired
    private UserRepo repo;

@Autowired
private Service service;


   @RequestMapping(value = "/get_ragister",method = RequestMethod.POST)
   public String ragister(@ModelAttribute User user){
       System.out.println(user);
        System.out.println(user.name);
       this.repo.save(user);
        return "success";
    }
/*
    @RequestMapping(value = "/get_ragister",method = RequestMethod.POST)
    public User login(@ModelAttribute User user){

        System.out.println(user);
        System.out.println(user.name);
        service.save(user);
        return user;

    }*/

    //@RequestMapping(value = "/get_ragister",method = RequestMethod.GET)
    /*@GetMapping("/get_ragister")
    public String login(@ModelAttribute User user){
        System.out.println(user);
        service.getLogin(user);
        return "form";
    }*/


}
