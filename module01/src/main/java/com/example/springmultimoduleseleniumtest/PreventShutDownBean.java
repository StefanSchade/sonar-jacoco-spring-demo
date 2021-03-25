package com.example.springmultimoduleseleniumtest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PreventShutDownBean {

    @Scheduled(fixedDelay = 1000 * 60 * 60)
    public void doNothing() {
        System.out.println("one hour has passed");
    }

}
