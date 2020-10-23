package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

public class GreetingService {

    public GreetingService() {
        System.out.println("+++++++++++++++++++++++GreetingService+++++++++++++++++++++++");
    }

    String sayHi() {
        return "hello world";
    }
}
