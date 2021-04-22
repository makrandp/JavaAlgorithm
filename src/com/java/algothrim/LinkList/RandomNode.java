package com.java.algothrim.LinkList;

public class RandomNode {
    public int val;
    public RandomNode next;
    public RandomNode random;

    public RandomNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public RandomNode(int val,RandomNode next, RandomNode random){
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
