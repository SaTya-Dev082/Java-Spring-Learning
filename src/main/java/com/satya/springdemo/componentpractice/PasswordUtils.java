package com.satya.springdemo.componentpractice;

import org.springframework.stereotype.Component;

@Component 
public class PasswordUtils {
    
    public String hashPassword(String password){
        return "hashed_"+password;
    }
}
