package com.java.algothrim.amazon.oa;

import java.util.*;

public class ItemsInContainers {
public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
    int n = s.length();
    Map<Integer, Integer> prefixSums = new HashMap<>();

    // get the prefix sum for the string
    int curSum = 0;
    for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '|')
            prefixSums.put(i, curSum);
        else
            curSum++;
    }

    System.out.println(prefixSums);

    // finding the right most closest boundary
    int right = -1;
    int[] rightBoundary = new int[n];
    for (int i = n - 1; i >= 0; i--) {
        if (s.charAt(i) == '|') {
            right = i;
        }
        rightBoundary[i] = right;
    }
    System.out.println(Arrays.toString(rightBoundary));

    // finding the left most closest boundary
    int left = -1;
    int[] leftBoundary = new int[n];
    for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '|') {
            left = i;
        }
        leftBoundary[i] = left;
    }
    System.out.println(Arrays.toString(leftBoundary));

    List<Integer> res = new ArrayList<>();

    //use prefix sum to calculate the difference between left boundary & right boundary
    for (int i = 0; i < startIndices.size(); i++) {
        int start = rightBoundary[startIndices.get(i) ];
        int end = leftBoundary[endIndices.get(i) ];
        if (start != -1 && right != -1 && start < end) {
            res.add(prefixSums.get(end) - prefixSums.get(start));
        } else
            res.add(0);
    }

    return res;
}
}
