package org.example;

import java.util.PriorityQueue;

public class MyPriorityQueue implements PriorityQueueInterface{
    PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

    @Override
    public void addPriorityQueue(Integer x) {
        myPriorityQueue.add(x);

    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "myPriorityQueue=" + myPriorityQueue +
                '}';
    }

    @Override
    public void removePriorityQueue() {
        myPriorityQueue.remove();

    }

    @Override
    public boolean emptyPriorityQueue() {
        return myPriorityQueue.isEmpty();

    }
}
