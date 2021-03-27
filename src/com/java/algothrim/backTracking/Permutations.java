package com.java.algothrim.backTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/permutations/
public class Permutations {

    //https://www.youtube.com/watch?v=nYFd7VHKyWQ&t=39s
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int[] counts = new int[nums.length];
        Arrays.fill(counts, 1);

        permuteR(nums,counts,0,new int[nums.length],list);

        return list;
    }

    private static void permuteR(int[] nums, int[] count, int level, int[] permutation,
                          List<List<Integer>> resultList) {
        if(level == nums.length){
            addToResultList(resultList,permutation);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(count[i] == 0){
                continue;
            }

            permutation[level] = nums[i];
            count[i] --;
            permuteR(nums,count,level + 1, permutation, resultList);
            count[i] ++;
        }

    }

    private static void addToResultList(List<List<Integer>> resultList,int[] permutation){
        List<Integer> list = new LinkedList<>();
        for (int i:permutation) {
            list.add(i);
        }
        resultList.add(list);
    }






}
