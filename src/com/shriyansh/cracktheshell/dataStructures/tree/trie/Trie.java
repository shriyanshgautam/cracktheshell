package com.shriyansh.cracktheshell.dataStructures.tree.trie;

public class Trie {

    public static void insertString(TrieNode root, String string){
        for(int i=0;i<string.length();i++){
            if(!root.map.containsKey(string.charAt(i))){
                root.map.put(string.charAt(i),new TrieNode());
            }
            root = root.map.get(string.charAt(i));
        }
        root.isEndOfString = true;
    }

    public static boolean findString(TrieNode root, String string){
        for(int i=0;i<string.length();i++){
            if(!root.map.containsKey(string.charAt(i))){
                return false;
            }
            root = root.map.get(string.charAt(i));
        }
        return root.isEndOfString;
    }

    public static void deleteString(TrieNode root, String string){

    }

    public static void main(String[] args){
        TrieNode root = new TrieNode();
        insertString(root,"abcd");
        insertString(root,"abce");
        System.out.println(findString(root,"abce"));
    }
}
