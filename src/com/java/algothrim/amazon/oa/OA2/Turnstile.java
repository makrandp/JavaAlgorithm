package com.java.algothrim.amazon.oa.OA2;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Turnstile {

//    public static int[] getTimes(int numCustomers, int[] arrTime, int[] direction) {
//        PriorityQueue<Integer> en = new PriorityQueue<Integer>((a,
//                                                                b)->arrTime[a]-arrTime[b]);
//        PriorityQueue<Integer> ex = new PriorityQueue<Integer>((a,
//                                                                b)->arrTime[a]-arrTime[b]);
//        int[] res = new int[numCustomers];
//        for(int i = 0; i < direction.length; i++){
//            if(direction[i] == 1) ex.add(i);
//            else en.add(i);
//        }
//        int currentTime = 0, lastDirection = -1;
//        while(!ex.isEmpty() || !en.isEmpty()){
//            if(!ex.isEmpty() && arrTime[ex.peek()] <= currentTime && ( lastDirection == 1 || lastDirection == -1
//                    || en.isEmpty() || arrTime[en.peek()] > currentTime && lastDirection == 0)) {
//                res[ex.peek()] = currentTime;
//                lastDirection = 1;
//                ex.poll();
//            }
//            else if(!en.isEmpty() && arrTime[en.peek()] <= currentTime)
//            {
//                res[en.peek()] = currentTime;
//                lastDirection = 0;
//                en.poll();
//            }
//            else lastDirection = -1;
//            currentTime++;
//        }
//        return res;
//    }

    public static int[] getTimes(int numCustomers, int[] arrTime, int[] direction) {
        PriorityQueue<Integer> en = new PriorityQueue<Integer>((a,
                                                                b)->arrTime[a]-arrTime[b]);
        PriorityQueue<Integer> ex = new PriorityQueue<Integer>((a,
                                                                b)->arrTime[a]-arrTime[b]);
        int[] res = new int[numCustomers];
        for(int i = 0; i < direction.length; i++){
            if(direction[i] == 1) ex.add(i);
            else en.add(i);
        }
        int currentTime = 0, lastDirection = -1;
        while(!ex.isEmpty() || !en.isEmpty()){
            if(!ex.isEmpty() && arrTime[ex.peek()] <= currentTime && ( lastDirection != 0
                    || (arrTime[en.peek()] > currentTime && lastDirection == 0))) {
                res[ex.peek()] = currentTime;
                lastDirection = 1;
                ex.poll();
            }
            else if(!en.isEmpty() && arrTime[en.peek()] <= currentTime)
            {
                res[en.peek()] = currentTime;
                lastDirection = 0;
                en.poll();
            }
            else lastDirection = -1;
            currentTime++;
        }
        return res;
    }






}
