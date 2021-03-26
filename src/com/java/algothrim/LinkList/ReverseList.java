package com.java.algothrim.LinkList;
//https://leetcode.com/problems/reverse-linked-list/solution/
public class ReverseList {

//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null){
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return  prev;
//    }
//
//
    public static ListNode reverseListR(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListR(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
