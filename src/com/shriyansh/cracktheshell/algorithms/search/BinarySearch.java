package com.shriyansh.cracktheshell.algorithms.search;


public class BinarySearch {
    private int[] array;

    BinarySearch(int[] array) {
        this.array = array;
    }

    public boolean search(int data) {
        return searchHelper(data, 0, array.length - 1);
    }

    private boolean searchHelper(int data, int low, int high) {
        /**
         * Remember <= for edges
         */
        while (low <= high) {
            // Do not use low + (high - low)/2
            int mid = (low + high)/2;
            if (array[mid] == data) {
                return true;
            } else if (array[mid] > data){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
