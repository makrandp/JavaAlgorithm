package com.java.algothrim.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));


        List<int[]> range = new ArrayList<>();

        for (int[] big :intervals) {
            if(!range.isEmpty()){
                int[] small = range.get(range.size()-1);
                if(isOverLap(range.get(range.size()-1), big)){
                    mergeInterval(small,big);
                }else{
                    range.add(big);
                }
            }else {
                range.add(big);
            }

        }

        return range.toArray(new int[range.size()][]);
    }

    private boolean isOverLap(int[] a, int[] b){
        return a[0] <= b[0] && b[0] <= a[1];
    }

    private void mergeInterval(int[] a, int[] b){
        if(isOverLap(a,b)){
            a[0] = a[0];
            a[1] = Math.max(Math.max(a[0],a[1]),Math.max(b[0],b[1]));
        }
    }



}
