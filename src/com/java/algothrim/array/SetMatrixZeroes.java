package com.java.algothrim.array;

import java.util.Arrays;

public class SetMatrixZeroes {
    //https://leetcode.com/problems/set-matrix-zeroes/

    //Additional Memory Approach
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; //height
        int n = matrix[0].length; //weight

        boolean[] mHasZero = new boolean[m];// height
        boolean[] nHasZero = new boolean[n];// weight

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    mHasZero[i] = true;
                    nHasZero[j] = true;
                }
            }
        }

        for (int i = 0; i < mHasZero.length; i++) {
            if (mHasZero[i]) {
                setRowZero(matrix, i);
            }
        }

        for (int i = 0; i < nHasZero.length; i++) {
            if (nHasZero[i]) {
                setColumnZero(matrix, i);
            }
        }
    }

    private void setRowZero(int[][] matrix, int row) {
        Arrays.fill(matrix[row], 0);
    }

    private void setColumnZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

}
