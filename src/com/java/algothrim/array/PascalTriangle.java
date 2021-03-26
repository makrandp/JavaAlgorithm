package com.java.algothrim.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/submissions/
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrays = new ArrayList(Arrays.asList(new Integer[numRows]));
        for (int column = 0; column < numRows; column++) {
            List<Integer> rowList = new ArrayList(Arrays.asList(new Integer[column + 1]));
            for (int row = 0; row <= column; row++) {
                if (row == 0 || row == rowList.size() -1) {
                    rowList.set(row,1);
                } else {
                    rowList.set(row,arrays.get(column-1).get(row - 1) + arrays.get(column -1 ).get(row));
                }
            }
            arrays.set(column,rowList);
        }
        return arrays;
    }

    public  static String print2DArray(List<List<Integer>> myBoard){
        String result = "";
        for(int i = 0; i < myBoard.size(); i++){
            for(int j = 0; j < myBoard.get(i).size(); j++){
                result += myBoard.get(i).get(j);
            }
            // System.out.println();
            result += "\n";
        }
        return result;
    }
}
