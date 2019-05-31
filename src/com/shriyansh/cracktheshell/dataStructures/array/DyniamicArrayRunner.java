package com.shriyansh.cracktheshell.dataStructures.array;

public class DyniamicArrayRunner {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(2);
        dynamicArray.insert(1);
        dynamicArray.insert(2);
        System.out.println(dynamicArray.size() + "/" + dynamicArray.occupied());
        dynamicArray.insert(3);
        System.out.println(dynamicArray.size() + "/" + dynamicArray.occupied());
        dynamicArray.insert(4);
        dynamicArray.insert(5);
        System.out.println(dynamicArray.size() + "/" + dynamicArray.occupied());
    }
}
