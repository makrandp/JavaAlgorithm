package com.java.algothrim.amazon.oa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class OptimizingBoxWeights {
    public static int[] optimizingBoxWeights(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int target = sum/ 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });

        for (int i : nums) {
            pq.add(i);
        }

        int curSum = 0;
        List<Integer> res = new ArrayList<>();
        while (curSum <= target) {
            int val = pq.poll();
            curSum += val;
            res.add(val);
        }
        Collections.reverse(res);
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }

}
