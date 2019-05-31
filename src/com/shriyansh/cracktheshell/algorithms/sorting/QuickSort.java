package com.shriyansh.cracktheshell.algorithms.sorting;

public class QuickSort {
    private int[] array;

    QuickSort(int[] array) {
        this.array = array;
    }

    private int partition(int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[low];
        while(i<j) {
            do {
                i++;
            } while(array[i] >= pivot);
            do {
                j--;
            } while(array[j] < pivot);
            if (i<j) {
               swap(i,j);
            }
        }
        swap(low, j);
        return j;
    }

    public void sort(int low, int high) {
        if (low < high) {
            int j = partition(low, high);
            sort(low, j);
            sort(j+1, high);
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print() {
        for(int val:array) {
            System.out.println(val + " ");
        }
    }

}
