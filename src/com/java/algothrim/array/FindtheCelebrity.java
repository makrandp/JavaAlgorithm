package com.java.algothrim.array;

//https://leetcode.com/problems/find-the-celebrity/
public class FindtheCelebrity {
    private boolean knows(int a,int b){
        return false;
    }

    public int findCelebrity(int n) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    boolean known = knows(i, j);
                    graph[i][j] = known ? 1 : 0;
                }else{
                    graph[i][j] = 1;
                }

            }
        }

        return findCelebrity(graph);




    }

    private int findCelebrity(int[][] graph){
        int m = graph.length;
        int n = graph[0].length;
        int count = 0;
        for(int i = 0; i < n; i ++ ){
            boolean isCelebrity = true;
            for (int[] row: graph) {
                if(row[i] == 0){
                    isCelebrity = false;
                }
            }

            for(int y = 0; y < graph[count].length; y++){
                if(y != count && graph[count][y] == 1){
                    isCelebrity = false;
                }
            }

            count++;

            if(isCelebrity){
                return i;
            }

        }
        return -1;
    }

    //if A know B -- > A is not celebrity
    //if A dont know B -- > B is not celebrity

    /*
        celebrityCandidate = 0
        iterate from 0 to n-1
             if know(candidate, i){
                candidate = i; // candidate knows i  --> so candidate is not celebrity
             }else{
                //candidate dont know i, i can not be celebrity
                continue;
             }

     */


    public int findCelebrityReduction(int n) {
        int candidate = 0;
        for (int i = 0; i < n;i++){
            if(knows(candidate,i)){
                candidate = i;
            }
        }

        if(isCelebrity(candidate,n)){
            return candidate;
        }

        return -1;

    }

    private boolean isCelebrity(int i,int n) {
        for (int j = 0; j < n; j++) {
            if (i == j) continue; // Don't ask if they know themselves.
            if (knows(i, j) || !knows(j, i)) {
                return false;
            }
        }
        return true;
    }

}
