package com.java.algothrim.amazon.oa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.dropbox.com/s/w44l4drzvwpoeyk/Storage%20Optimization.pdf?dl=0
public class StorageOptimization {
    public static int storage(int n,int m, int[] h,int[] v){
        int totalRow = n + 2;
        int totalColumn = m + 2;
        List<Integer> rows = new ArrayList<>();
        for(int i = 0; i < totalRow; i ++){
            rows.add(i);
        }
        List<Integer> cols = new ArrayList<>();
        for(int i = 0; i < totalColumn; i ++){
            cols.add(i);
        }

        for(int row : h){
            rows.remove(Integer.valueOf(row));
        }
        for(int col : v){
            cols.remove(Integer.valueOf(col));
        }

        Collections.sort(rows);
        Collections.sort(cols);

        int maxRowGap = 0, maxColGap = 0;

        for(int i = 1; i < rows.size();i ++){
            maxRowGap = Math.max(maxRowGap,rows.get(i) - rows.get(i - 1));
        }

        for(int i = 1; i < cols.size();i ++){
            maxColGap = Math.max(maxColGap,cols.get(i) - cols.get(i - 1));
        }

        return  maxColGap * maxRowGap;

    }
}
