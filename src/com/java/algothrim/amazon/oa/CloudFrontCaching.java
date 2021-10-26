package com.java.algothrim.amazon.oa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//https://leetcode.com/discuss/interview-question/1256258/Connected-sum-in-a-graph-or-Amazon-OA
public class CloudFrontCaching {

    //union find
    public static int set(int n, int[][] arr) {
        if (n < 2) {
            return n;
        }
        List<HashSet<Integer>> list = (new ArrayList<>());

        for (int i = 0; i < n; i++) {
            HashSet<Integer> intHash = new HashSet<>();
            intHash.add(i);
            list.add(intHash);
        }

        //calculate all the possible graph using union find
        for (int[] edge : arr) {
            HashSet<Integer> value = null;
            for (int i = 0; i < list.size(); i++) {
                HashSet<Integer> item = list.get(i);
                if (item.contains(edge[0])) {
                    if (value == null) {
                        value = item;
                    } else {
                        value.addAll(item);
                        list.remove(item);
                    }
                }
                if (item.contains(edge[1])) {
                    if (value == null) {
                        value = item;
                    } else {
                        value.addAll(item);
                        list.remove(item);
                    }
                }
            }
        }

        System.out.println(list);

        int result = 0;
        for (HashSet<Integer> item : list) {
            result = (int) (result + Math.ceil(Math.sqrt(item.size())));
        }
        return result;
    }


    //https://leetcode.com/discuss/interview-question/1168802/amazon-oa

    int counter=0;
    public int countComponents(int n, int[][] edges) {
        int[] visited = new int[n];
        List[] adjList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edges.length; i++) {

            adjList[edges[i][0]].add(edges[i][1]);
            adjList[edges[i][1]].add(edges[i][0]);
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                counter=0;
                dfs(adjList, visited, i);
                sum+=Math.ceil(Math.sqrt(counter));
            }
        }
        return sum;
    }

    private void dfs(List<Integer>[] adjList,int[] visited,int index) {
        visited[index]=1;
        counter+=1;
        for(int i=0;i<adjList[index].size();i++){
            if(visited[adjList[index].get(i)]==0){
                dfs(adjList,visited,adjList[index].get(i));
            }
        }
    }
}
