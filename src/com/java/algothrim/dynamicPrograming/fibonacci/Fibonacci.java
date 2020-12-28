package com.java.algothrim.dynamicPrograming.fibonacci;

import java.util.Arrays;

public class Fibonacci {


    public static void test() {
        for(int i = 0; i<= 14; i ++){
            printResult(i);
        }
    }

    public static void printResult(int n){
        System.out.println(n + "th fibonacci number is " + fibonacciNum(n));
    }

    public static int fibonacciNum(int n) {
        int[] list = new int[n];
        Arrays.fill(list, -1);
        return fibonacciNum(n, list);
    }

    private static int fibonacciNum(int n, int[] list) {
        int result;

        if(n == 0){
            return 0;
        }

        if (list[n-1] != -1) {
            return list[n-1];
        }

        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fibonacciNum(n - 1, list) + fibonacciNum(n - 2, list);

        }
        list[n-1] = result;
        return result;

    }
}
