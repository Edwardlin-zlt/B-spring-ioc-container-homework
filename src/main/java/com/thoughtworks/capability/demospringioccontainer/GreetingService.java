package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;


@Scope(SCOPE_PROTOTYPE)
@Service
public class GreetingService {
    public GreetingService() {
        System.out.println("++++++++++++++GreetingService+++++++++++++++");
    }

    String sayHi() {
        return "hello world";
    }
}
