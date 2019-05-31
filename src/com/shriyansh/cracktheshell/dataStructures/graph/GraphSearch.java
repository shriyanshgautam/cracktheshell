package com.shriyansh.cracktheshell.dataStructures.graph;

import java.util.*;

public class GraphSearch {
    private Map<Long, Node> map;
    private Map<Long, Boolean> dfsVisits;
    private Map<Long, Boolean> bfsVisits;

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

    GraphSearch() {
        map = new LinkedHashMap<>();
    }

    public void addNode(Long data) {
        Node node = new Node(data);
        map.put(data, node);
    }

    public void addEdge(Long first, Long second) {
        Node firstNode = map.get(first);
        Node secondNode = map.get(second);

        if (!firstNode.children.contains(secondNode)) {
            firstNode.children.add(secondNode);
        }
    }

    public void depthFirstSearch(Node startNode) {
        dfsVisits = new LinkedHashMap<>();
        // Loop over vertices and mark them false;
        dfsHelper(startNode);
    }

    private void dfsHelper(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        dfsVisits.put(node.data, true);
        for (Node adjacent: node.children) {
            if (!dfsVisits.get(adjacent.data)) {
                dfsHelper(adjacent);
            }
        }
    }

    public void breadthFirstSearch(Node startNode) {
        bfsVisits = new LinkedHashMap<>();
        // Loop over vertices and mark them false;
        breadthFirstHelper(startNode);
    }

    private void breadthFirstHelper(Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        /*
        * Add to queue and mark visited, this has to be done together every time.
        */
        queue.add(node);
        bfsVisits.put(node.data, true);
        while (!queue.isEmpty()) {
            Node next = queue.pop();
            System.out.println(next.data);
            for (Node adjecent: next.children) {
                /*
                 * If not visited then only add to queue and mark visited.
                 */
                if (!bfsVisits.get(adjecent.data)) {
                    queue.add(adjecent);
                    bfsVisits.put(adjecent.data, true);
                }

            }
        }
    }

}
