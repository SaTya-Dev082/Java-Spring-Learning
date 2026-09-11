package com.satya.springdemo.applicationcontextpractice;

import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingService {
    public void sayHello() {
        System.out.println("Hello from GreetingService Bean!");
    }
}
