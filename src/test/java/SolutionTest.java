import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.ListNode;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testHasCycle() {
        Solution solution = new Solution();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        boolean expected1 = false;
        boolean actual1 = solution.hasCycle(list1);
        assertEquals(expected1, actual1);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = list2.next;
        boolean expected2 = true;
        boolean actual2 = solution.hasCycle(list2);
        assertEquals(expected2, actual2);

        ListNode list3 = new ListNode(1);
        list3.next = list3;
        boolean expected3 = true;
        boolean actual3 = solution.hasCycle(list3);
        assertEquals(expected3, actual3);

        ListNode list4 = new ListNode(1);
        list4.next = new ListNode(2);
        list4.next.next = new ListNode(3);
        list4.next.next.next = list4.next;
        boolean expected4 = true;
        boolean actual4 = solution.hasCycle(list4);
        assertEquals(expected4, actual4);

        ListNode list5 = new ListNode(1);
        list5.next = new ListNode(2);
        ListNode cycleNode = new ListNode(3);
        list5.next.next = cycleNode;
        cycleNode.next = new ListNode(4);
        cycleNode.next.next = cycleNode;
        boolean expected5 = true;
        boolean actual5 = solution.hasCycle(list5);
        assertEquals(expected5, actual5);

        ListNode list6 = new ListNode(1);
        boolean expected6 = false;
        boolean actual6 = solution.hasCycle(list6);
        assertEquals(expected6, actual6);

        ListNode list7 = new ListNode(1);
        ListNode current = list7;
        for (int i = 2; i <= 100000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        boolean expected7 = false;
        boolean actual7 = solution.hasCycle(list7);
        assertEquals(expected7, actual7);

        ListNode list8 = new ListNode(1);
        current = list8;
        for (int i = 2; i <= 100000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        current.next = list8.next;
        boolean expected8 = true;
        boolean actual8 = solution.hasCycle(list8);
        assertEquals(expected8, actual8);

        ListNode list9 = new ListNode(1);
        current = list9;
        for (int i = 2; i <= 100000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        current.next = list9;
        boolean expected9 = true;
        boolean actual9 = solution.hasCycle(list9);
        assertEquals(expected9, actual9);

        ListNode list10 = new ListNode(1);
        current = list10;
        for (int i = 2; i <= 50000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode cycleStart = current;
        for (int i = 50001; i <= 100000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        current.next = cycleStart;
        boolean expected10 = true;
        boolean actual10 = solution.hasCycle(list10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
