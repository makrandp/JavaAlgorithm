package com.java.algothrim.Int;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/reverse-integer/submissions/
public class ReverseInteger {
    public static int reverse(int x) {
        int orignial = x;
        x = Math.abs(x);
        List<Integer> list = new ArrayList<>();

        while(x > 0){

            list.add( x % 10);
            x = x /10;
        }

        int result = 0;

        for(int i = 0; i < list.size() ; i++){
            try{
                result = Math.addExact((int)(list.get(i) * Math.pow(10,list.size() - i  - 1 )),result) ;
            }catch (ArithmeticException e){
                return 0;
            }
        }

        if(orignial >= 0){
            return result;
        }else{
            return -result;
        }
    }
}
