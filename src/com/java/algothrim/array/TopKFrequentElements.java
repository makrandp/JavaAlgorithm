package com.java.algothrim.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i :
                nums) {
            resultMap.put(i, resultMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> sortKey = new ArrayList();

        resultMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortKey.add(x.getKey()));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = sortKey.get(i);
        }

        return result;


    }
}
