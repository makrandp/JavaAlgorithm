package com.java.algothrim.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        return isHappy(n,new HashSet<Integer>());
    }

    public static boolean isHappy(int n, Set<Integer> list){

        if (n == 1) {
            return true;
        }
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        if(list.contains(sum)){
            return false;
        }
        list.add(sum);
        System.out.println(list);
        return isHappy(sum,list);
    }
}


