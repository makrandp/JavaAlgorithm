package com.java.algothrim.dynamicPrograming.fibonacci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/unique-paths/
public class UniquePath {

    public static int uniquePathR(int m, int n) {
        System.out.println("m = " + m + ", n = " + n);
        if (m == 1 || n == 1) {
            return 1;
        }

        return uniquePathR(m - 1, n) + uniquePathR(m, n - 1);
    }

    public static int uniquePathDP(int m, int n) {
        int[][] d = new int[m][n];

        for(int[] arr : d) {
            Arrays.fill(arr, 1);
        }
        for(int col = 1; col < m; ++col) {
            for(int row = 1; row < n; ++row) {
                d[col][row] = d[col - 1][row] + d[col][row - 1];
            }
        }
        return d[m - 1][n - 1];
    }




}
