package com.mgu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.mechanitis.demo.multi.StackInfo;
import com.mechanitis.demo.multi.StackParser;

@SpringBootApplication
public class TestApplicationSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplicationSbApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        final StackInfo stackParser = new StackParser();
        System.out.println(stackParser.getStackCount());
        System.out.println(stackParser.getStack());
    }
}
