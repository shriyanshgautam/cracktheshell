package com.shriyansh.cracktheshell.dataStructures.graph;

import java.util.*;

public class TopologicalSort {
    private Map<Long, Node> map;


    public class Node implements Comparable{
        Long data;
        List<Node> children;

        Node (Long data) {
            this.data = data;
            this.children = new LinkedList<>();
        }

        @Override
        public int compareTo(Object o) {
            return this.data.compareTo(((Node)o).data);
        }
    }

    TopologicalSort() {
        map = new LinkedHashMap<>();

    }

    public Deque<Node> sort() {
        Set<Node> visited = new LinkedHashSet<>();
        Deque<Node> stack = new ArrayDeque<>();

        /*
         * Common
         */
        for (Node node : map.values()) {
            if (visited.contains(node)) {
                continue;
            }
            sortHelper(node, stack, visited);
        }

        /*
         * Result
         */
        return stack;
    }

    private void sortHelper(Node node, Deque<Node> stack, Set<Node> visited) {
        /*
         * Common
         */
        for (Node adjcent: node.children) {
            if (visited.contains(adjcent)) {
                continue;
            }
            sortHelper(adjcent, stack, visited);
        }

        /*
         * Insert in result.
         */
        stack.offerFirst(node);
    }


}
