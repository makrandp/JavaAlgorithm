package com.java.algothrim.amazon.oa;

import java.util.*;

//https://leetcode.com/discuss/interview-question/1025705/Amazon-or-OA-or-Prime-Air-time/824897
public class PrimeAir {
    public static List<int[]>  getOptimalRoute(int maxTravelDist, int[][] forwardRoute, int[][] returnRoute) {// 按旅程从大到小排列
        Arrays.sort(forwardRoute, (a, b)->b[1]-a[1]);


        TreeMap<Integer, Stack<Integer>> map= new TreeMap<>();
        for(var rr:returnRoute) {
            // 按旅程分组
            // TreeMap : mile, Stack<id> /
            Stack<Integer> stack=map.getOrDefault(rr[1],new Stack<Integer>());
            stack.push(rr[0]);
            map.put(rr[1],stack);
        }


        List<int[]> dest=new ArrayList<int[]>();
        for(int[] fr:forwardRoute) {
            // 贪心，永远取和最接近最大里程的组
            Map.Entry<Integer, Stack<Integer>> re=map.floorEntry(maxTravelDist-fr[1]);
            // 如果没有合适的，说明最小值和这个值的和都大于里程数了
            if(re==null) continue;
            // 随便取一个
            Stack<Integer> stack=re.getValue();
            dest.add(new int[] {fr[0],stack.pop()});
            // 如果空了删除主键
            if (stack.isEmpty()) map.remove(re.getKey());


        }
        return dest;

    }
}
