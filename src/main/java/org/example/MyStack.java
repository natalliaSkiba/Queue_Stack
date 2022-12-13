package org.example;

import java.util.Stack;

public class MyStack implements StackInterface {
    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }

    Stack<String> stack = new Stack<>();

    @Override
    public void boxAdd(String s) {
        stack.push(s);
    }

    @Override
    public void boxDelete() {
        stack.pop();

    }

    @Override
    public boolean boxIsEmpty() {

        return stack.empty();
    }
}
