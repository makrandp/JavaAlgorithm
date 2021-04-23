package com.java.algothrim.array;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersection(nums2,nums1);
        }

        Map<Integer,Integer> map = new HashMap();
        for(int i :nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Set<Integer> list = new HashSet<>();
        for (int num:nums2) {
            if(map.containsKey(num) && map.get(num)> 0){
                list.add(num);
                map.put(num,map.get(num) -1);
            }

        }

        return  list.stream().mapToInt(i -> i).toArray();
    }
}
