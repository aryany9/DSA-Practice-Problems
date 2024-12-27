package LinkedLists.Problems;

import java.util.ArrayList;
import java.util.List;

/*
    PROBLEM: Find the Middle of the Linked List
    Given the head of a singly linked list, return the middle node of the linked list.
    If there are two middle nodes, return the second middle node.
*/
public class Middle_Linked_List {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to convert linked list to list and print it
    private static List<Integer> toList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }

    private static class Solution {
        public ListNode middleNode(ListNode head) {
            int length = 0;
            ListNode current = head;

            // Step 1: Calculate the length of the Linked List
            while (current != null) {
                length++;
                current = current.next;
            }

            // Step 2: Find the middle index
            int middleIndex = length / 2;

            // Step 3: Traverse again to the middle node
            current = head; // Reset current to the start of the list
            for (int i = 0; i < middleIndex; i++) {
                current = current.next;
            }

            return current;
        }
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(10);
        ln.next = new ListNode(20);
        ln.next.next = new ListNode(30);
        ln.next.next.next= new ListNode(40);
        ln.next.next.next.next= new ListNode(50);

        // Convert and print the linked list as a list
        System.out.println(toList(ln));

        System.out.println(toList(new Solution().middleNode(ln)));
    }

}
