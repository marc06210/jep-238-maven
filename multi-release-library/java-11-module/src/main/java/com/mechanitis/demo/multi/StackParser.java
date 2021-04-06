package com.mechanitis.demo.multi;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StackParser implements StackInfo {
    @Override
    public String getStackCount() {
        return "Java 11: " + StackWalker.getInstance()
                .walk(Stream::count);
    }

    @Override
    public String getStack() {
        return StackWalker.getInstance()
                .walk(frames -> frames.map(Object::toString)
                        .collect(joining("\n")));
    }

}
