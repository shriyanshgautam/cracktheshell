package com.shriyansh.cracktheshell.dataStructures.graph;

public class GraphRunner {
    public static void main(String[] args) {
        DisjointSet disjointSet = new DisjointSet();
        disjointSet.makeSet(1L);
        disjointSet.makeSet(2L);
        disjointSet.makeSet(3L);
        disjointSet.makeSet(4L);
        disjointSet.makeSet(5L);
        disjointSet.makeSet(6L);
        disjointSet.makeSet(7L);

        disjointSet.union(4L, 7L);

        System.out.println(disjointSet.findSet(6L).data + "-" + disjointSet.findSet(7L).data);

        GraphSearch graphSearch = new GraphSearch();
    }
}
