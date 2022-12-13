package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.boxAdd("red");
        q.boxAdd("yellow");
        q.boxAdd("ping");
        q.boxAdd("white");
        q.boxAdd("black");
        q.boxAdd("blue");
        System.out.println(q);
        if (!q.boxIsEmpty()) {
            q.boxDelete();
        }
        System.out.println(q);

        //-----------------------------------
        MyStack stack = new MyStack();

        stack.boxAdd("1111");
        stack.boxAdd("2222");
        stack.boxAdd("3333");
        stack.boxAdd("4444");
        stack.boxAdd("5555");
        stack.boxAdd("6666");
        System.out.println(stack);

        if (!stack.boxIsEmpty()) {
            stack.boxDelete();
        }
        System.out.println(stack);
        //-------------------------------------
        MyPriorityQueue priorityQueue = new MyPriorityQueue();
        priorityQueue.addPriorityQueue(123);
        priorityQueue.addPriorityQueue(223);
        priorityQueue.addPriorityQueue(23);
        priorityQueue.addPriorityQueue(13);
        priorityQueue.addPriorityQueue(1234);
        System.out.println(priorityQueue);
        if (!priorityQueue.emptyPriorityQueue()) {
            priorityQueue.removePriorityQueue();
        }
        System.out.println(priorityQueue);

    }
}