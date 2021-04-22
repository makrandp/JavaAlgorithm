package com.java.algothrim.LinkList;

public class OddEvenLinkedList {

    //https://leetcode.com/problems/odd-even-linked-list/solution/
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }


        ListNode oddTemp = head;
        ListNode even;

        ListNode prev = oddTemp;
        ListNode current = oddTemp.next;
        ListNode next = oddTemp.next.next;

        prev.next = next;
        even = current;
        ListNode evenTemp = even;
        oddTemp = oddTemp.next;

        while (oddTemp != null && oddTemp.next != null) {
            prev = oddTemp;
            current = oddTemp.next;
            next = oddTemp.next.next;

            prev.next = next;
            evenTemp.next = current;

            oddTemp = oddTemp.next;
            evenTemp = evenTemp.next;

        }

        oddTemp = head;

        //move evenTemp to secondLast Node
        while (evenTemp.next != null && evenTemp.next.next != null) {
            evenTemp = evenTemp.next;
        }
        evenTemp.next = null;

        while (oddTemp.next != null) {
            oddTemp = oddTemp.next;
        }
        oddTemp.next = even;

        return head;
    }


    public static ListNode oddEvenListSolution(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddTemp = head;
        ListNode evenRoot = head.next;
        ListNode evenTemp = evenRoot;

        while (evenTemp != null && evenTemp.next != null) {
            oddTemp.next = evenTemp.next;
            oddTemp = oddTemp.next;
            evenTemp.next = oddTemp.next;
            evenTemp = evenTemp.next;
        }

        oddTemp.next = evenRoot;

        return head;
    }
}
