package com.java.algothrim.amazon.oa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://leetcode.com/discuss/interview-question/989768/Amazon-or-OA-2020-or-Transaction-logs
//https://algo.monster/problems/transaction_logs
public class TransactionLogs {
    public static List<String> getUserIds(List<String> logs, int threshold) {
        Map<String, Integer> counter = new HashMap<>();
        for (String log : logs) {
            String[] tokens = log.split("\\s+");
            String userid1 = tokens[0];
            String userid2 = tokens[1];
            counter.put(userid1, counter.getOrDefault(userid1, 0) + 1);
            if (userid2 != userid1) {
                counter.put(userid2, counter.getOrDefault(userid2, 0) + 1);
            }
        }
        return counter.entrySet().stream().filter(entry -> entry.getValue() >= threshold).map(Map.Entry::getKey).sorted().collect(
                Collectors.toList());
    }
}
