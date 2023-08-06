package org.example;

public class Solution {

    /**
     * Checks if there is a cycle in the given linked list.
     *
     * @param head The head node of the linked list.
     * @return {@code true} if there is a cycle, {@code false} otherwise.
     */
    public boolean hasCycle(ListNode head) {
        ListNode slowPos = head;
        ListNode fastPos = head;

        while (fastPos != null && fastPos.next != null) {
            slowPos = slowPos.next;
            fastPos = fastPos.next.next;
            if (slowPos == fastPos) return true;
        }

        return false;
    }
}
