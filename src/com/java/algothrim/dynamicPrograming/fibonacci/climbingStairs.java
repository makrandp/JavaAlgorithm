package com.java.algothrim.dynamicPrograming.fibonacci;

//https://leetcode.com/problems/climbing-stairs/solution/
public class climbingStairs {

    public int climbStairs(int n) {
        return climb_Stairs(0, n);
    }

    //https://www.youtube.com/watch?v=5o-kdjv7FD0&t=812s
    public int climbStairsDP(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }

    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }


    public int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}
