package com.example.springmultimoduleseleniumtest.module01;

import com.example.springmultimoduleseleniumtest.module02.ClassFromModule02;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class BootstrapClass implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        System.out.println("Context was initialized");

        ClassFromModule02 cfm2 = new ClassFromModule02();

        double value = 1;
        double doublethevalue = cfm2.doubleTheDouble(1);

        System.out.printf("Double the value is " + doublethevalue);

    }
}
