package com.java.algothrim.simple;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                count ++;
            }
            n = (n - 1) / 10;

        }
        return count;
    }
}
