package com.shriyansh.cracktheshell.dataStructures.graph;

import java.util.LinkedHashMap;
import java.util.Map;

public class DisjointSet {

    public class Node {
        Long data;
        Long rank;
        Node parent;
    }
    private Map<Long, Node> map;

    DisjointSet() {
        map = new LinkedHashMap<>();
    }

    public void makeSet(Long data) {
        /*
         * Create new node.
         */
        Node node = new Node();
        node.parent = node;
        node.data = data;
        node.rank = 0L;

        /*
         * Put new node in map.
         */
        map.put(data, node);
    }

    public Node findSet(Long data) {
        return findSet(map.get(data));
    }

    public Node findSet(Node node) {
        if (node != null) {
            Node parent = node.parent;
            if (parent == node) {
                return parent;
            }
            /**
             * Path compression.
             */
            parent = findSet(node.parent);
            return parent;
        }
        return null;
    }

    public void union(Long first, Long second) {
        Node firstNode = findSet(first);
        Node secondNode = findSet(second);

        /*
         * Part of same set;
         */
        if (firstNode == secondNode) {
            return;
        }

        if (firstNode.rank >= secondNode.rank) {
            secondNode.parent = firstNode;
            firstNode.rank += 1;
        } else {
            firstNode.parent = secondNode;
            secondNode.rank += 1;
        }
    }
}
