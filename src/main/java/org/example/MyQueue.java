package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue implements QueueInterface {


    Queue<String> queue = new LinkedList<>();

    @Override
    public String toString() {
        return "MyQueue{" +
                "queue=" + queue +
                '}';
    }

    @Override
    public void boxAdd(String s) {
        queue.add(s);
    }

    @Override
    public void boxDelete() {
        queue.poll();
    }

    @Override
    public boolean boxIsEmpty() {

        return queue.isEmpty();
    }
}
