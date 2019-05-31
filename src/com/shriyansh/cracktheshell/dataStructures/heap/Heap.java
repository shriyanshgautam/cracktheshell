package com.shriyansh.cracktheshell.dataStructures.heap;

import java.util.Arrays;

public class Heap {

    private int[] items = new int[1];
    private int size = 0;

    private int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int getParentIndex(int index) {
        return (index - 1)/2;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private int parent(int index) {
        return items[getParentIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int item(int index) {
        return items[index];
    }

    private void swap(int indexOne, int indexTwo) {
        int firstItem = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = firstItem;
    }

    private void ensureCapacity() {
       if(items.length == size) {
           items = Arrays.copyOf(items, items.length * 2);
       }
    }

    public int peek() {
        if(size != 0) {
            return items[0];
        }
        return -1;
    }

    public int pop() {
        int item = -1;
        if (size != 0) {
            item = items[0];
            items[0] = items[size];
            size--;
            heapifyDown();
        }
        return item;
    }

    public void insert(int item){
        ensureCapacity();
        items[size++] = item;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        if (size != 0) {
            while(hasParent(index) && parent(index) > item(index)) {
                swap(parent(index), item(index));
                index = getParentIndex(index);
            }
        }
    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if(item(index) < item(smallerChildIndex)) {
                break;
            }
            else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
}
