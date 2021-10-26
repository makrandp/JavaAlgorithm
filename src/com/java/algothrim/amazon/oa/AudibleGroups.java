package com.java.algothrim.amazon.oa;

//https://leetcode.com/problems/number-of-provinces/solution/
public class AudibleGroups {
    public static int findCircleNum(String[] strings) {
        int[][]M = convertToIntArray(strings);

        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    public static void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }


    public static int[][] convertToIntArray(String[] strings){
        int [][] converted = new int[strings.length][];
        for (int i = 0; i < strings.length;i ++){
            String s = strings[i];
            int[] array = new int[s.length()];
            for(int j = 0; j < s.length();j ++){
                array[j] = s.charAt(j) - '0';
            }
            converted[i] = array;
        }
        return converted;
    }
}
