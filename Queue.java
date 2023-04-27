package com.bridgelabz.workshop2;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<K extends Comparable> {
    private final LinkedListOne<K> myLinkedList;

    public Queue() {

        myLinkedList = new LinkedListOne<>();
    }

    public void enqueue(K data) {
        myLinkedList.add(data);
    }

    public void display() {
        myLinkedList.display();
    }



}
