package com.java.algothrim.stack;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/min-stack/
public class MinStack {
    List<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        int min = list.get(0);
        for (int i: list) {
            min = Math.min(min,i);
        }

        return min;
    }
}
