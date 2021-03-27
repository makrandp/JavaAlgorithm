package com.java.algothrim.dimensionArray;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/
public class RotateImage {


    public static void rotate(int[][] matrix) {
        int[][] result = new int[3][3];
        int k = matrix.length;


        for(int i = 0 ; i < (k + 1) / 2 ; i ++){
            for(int j = 0; j < k  / 2 ; j ++ ){
                swap(matrix,i,j);
            }
        }

    }

    private static void swap(int[][] matrix, int i, int j){
        int k = matrix.length;
        int first = matrix[i][j];
        int second = matrix[j][k-i-1];
        int third = matrix[k-i-1][k - j - 1];
        int fourth = matrix[k-j-1][i];

        matrix[i][j] = fourth;
        matrix[j][k-i-1] = first;
        matrix[k-i-1][k - j - 1] = second;
        matrix[k-j-1][i] = third;
    }

    private static void replace(int[][] matrix, int i, int j,int[][] result){
        result[j][matrix.length - i - 1] = matrix[i][j];
    }

}
