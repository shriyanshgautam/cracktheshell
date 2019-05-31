package com.shriyansh.cracktheshell.dataStructures.hashMap;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        int val = map.get("a");
        map.replace("a", val + 1);
        System.out.println(map.get("b")+ "");
        print(map);



        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(1);
        queue.add(2);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);


        while(!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

    static void print(HashMap<String,Integer> map){
        System.out.println(map);

    }






}
