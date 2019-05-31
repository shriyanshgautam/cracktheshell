package com.shriyansh.cracktheshell.dataStructures.linkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        list.print();

        System.out.println(list.size());

    }

}
