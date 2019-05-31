package com.shriyansh.cracktheshell.dataStructures.array;

import java.util.Arrays;

public class DynamicArray {
    private static final int INCREASING_FACTOR = 2;

    private int[] array;
    private int size;

    /**
     * Takes initial size of the dynamic array.
     *
     * @param initialSize initial size
     */
    DynamicArray(int initialSize) {
        this.array = new int[initialSize];
        this.size = 0;
    }

    /**
     * Inserts a new element into the array.
     *
     * @param value value to be inserted
     */
    public void insert(int value) {
        ensureCapacity();
        this.array[size] = value;
        size++;
    }

    public int size() {
        return array.length;
    }

    public int occupied() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * INCREASING_FACTOR);
        }
    }
}
