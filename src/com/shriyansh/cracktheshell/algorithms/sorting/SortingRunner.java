package com.shriyansh.cracktheshell.algorithms.sorting;

public class SortingRunner {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(new int[]{3,8,2,6,4,1});
        quickSort.sort(0, 5);
        quickSort.print();
    }
}
