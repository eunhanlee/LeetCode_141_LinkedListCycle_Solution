package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();

        ListNode list = new ListNode(3);
        list.next = new ListNode(2);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(-4);
        list.next.next.next.next =  list.next;

        System.out.println(tt.hasCycle(list));
    }
}