package com.shriyansh.cracktheshell.dataStructures.tree.trie;


import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    TrieNode(){
       this.isEndOfString = false;
    }

    TrieNode(boolean isEndOfString){
        this.isEndOfString = isEndOfString;
    }
    Map<Character,TrieNode> map = new HashMap<>();
    boolean isEndOfString;
}
