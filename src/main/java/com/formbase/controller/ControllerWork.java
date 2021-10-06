package com.formbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ControllerWork {

   private User user1;

@Autowired
    private UserRepo repo;

@Autowired
private Service service;


   @RequestMapping(value = "/get_ragister",method = RequestMethod.POST)
   public String ragister(@Valid User user, Errors error){
       if(error.hasErrors()) {
           return "/";
       }
       this.repo.save(user);
        return "Successfully Registration";
    }
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String loginPage(){
        return "login";

    }

    @RequestMapping(value = "/loginForm",method = RequestMethod.POST)
    public String login(@ModelAttribute User user){
        System.out.println(user);
         User res_user = service.getUser(user);

         if(res_user == null){

             return "User not Found";
         }
         if((user.name.equals(res_user.getName())) && (user.password.equals(res_user.getPassword())))
        return "Login Success";
         else
            return "Wrong password";
    }


}
