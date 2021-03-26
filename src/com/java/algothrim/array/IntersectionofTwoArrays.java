package com.java.algothrim.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }

        Map<Integer,Integer> map = new HashMap();
        for(int i :nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList();
        for (int num:nums2) {
            if(map.containsKey(num) && map.get(num)> 0){
                list.add(num);
                map.put(num,map.get(num) -1);
            }

        }

        return  list.stream().mapToInt(i -> i).toArray();
    }
}
