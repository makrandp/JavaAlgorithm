package com.java.algothrim.basicAlog;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {


    void DFSUtil(int v, boolean visited[], LinkedList<Integer>[] adj) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, adj);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v, Graph graph) {
        int V = graph.getV();
        LinkedList<Integer>[] adj = graph.getAdj();
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited, adj);
    }
}
