package com.mgu.jep238.test;

import com.mechanitis.demo.multi.StackInfo;
import com.mechanitis.demo.multi.StackParser;

public class Application {
    public static void main(String[] args) {
        final StackInfo stackParser = new StackParser();
        System.out.println(stackParser.getStackCount());
        System.out.println(stackParser.getStack());
    }
}
