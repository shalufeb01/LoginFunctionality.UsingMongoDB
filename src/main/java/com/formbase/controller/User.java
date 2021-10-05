package com.formbase.controller;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection ="userlgn")
public class User {

    String email;
    String name;
    String password;
    String re_password;


    public User(){

    }
    public User(String name, String password,String email,String re_password) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.re_password = re_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", re_password='" + re_password + '\'' +
                '}';
    }
}
