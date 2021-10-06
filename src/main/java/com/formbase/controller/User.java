package com.formbase.controller;


import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Setter
@Getter
@Document(collection ="userlgn")
public class User {

    @NotNull
    @Email(regexp = "^(.+)@(.+)$",message = "Invalid Email Pattern")
    String email;


    @NotEmpty(message = "Name field should not be empty")
    String name;

    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",message = "Invalid Password")
    String password;
    @NotNull
     @NotEmpty(message = "Re_Password should not be empty")
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
