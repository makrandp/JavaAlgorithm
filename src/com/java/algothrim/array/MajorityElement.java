package com.java.algothrim.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/solution/
public class MajorityElement {

//    private Map<Integer, Integer> countNums(int[] nums) {
//        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            if (!counts.containsKey(num)) {
//                counts.put(num, 1);
//            }
//            else {
//                counts.put(num, counts.get(num)+1);
//            }
//        }
//        return counts;
//    }
//
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> counts = countNums(nums);
//
//        Map.Entry<Integer, Integer> majorityEntry = null;
//        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
//            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
//                majorityEntry = entry;
//            }
//        }
//
//        return majorityEntry.getKey();
//    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxInt = map.keySet().iterator().next();
        for (Integer i : map.keySet()) {
            if (map.get(i) > map.get(maxInt)) {
                maxInt = i;
            }
        }

        return maxInt;

    }

    public static int majorityElementSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
