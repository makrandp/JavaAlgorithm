package com.java.algothrim.LinkList;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        ListNode current = headA;
        while (current != null){
            set.add(current);
            current = current.next;
        }

        current = headB;
        while (current != null){
            if(set.contains(current)){
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != tempB ){
            if(tempA == null){
                tempA = headB;
            }
            if(tempB == null){
                tempB= headA;
            }

            if(tempA == tempB){
                return tempA;
            }

            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
