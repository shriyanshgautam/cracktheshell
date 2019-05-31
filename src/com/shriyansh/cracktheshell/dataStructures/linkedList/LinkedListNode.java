package com.shriyansh.cracktheshell.dataStructures.linkedList;

public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }
}
