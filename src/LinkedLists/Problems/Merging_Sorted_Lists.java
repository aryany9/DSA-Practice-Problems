package LinkedLists.Problems;

import java.util.ArrayList;
import java.util.List;

/*
    PROBLEM: Merge Two Sorted Lists
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.
*/
public class Merging_Sorted_Lists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to convert linked list to list and print it
    public static List<Integer> toList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }

    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Create a dummy node to simplify merging process
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            // Traverse both lists
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = list1; // Add list1 node to merged list
                    list1 = list1.next;  // Move to the next node in list1
                } else {
                    current.next = list2; // Add list2 node to merged list
                    list2 = list2.next;  // Move to the next node in list2
                }
                current = current.next; // Move to the next node in the merged list
            }

            // Add remaining nodes of list1 or list2
            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }

            // Return the merged list (skipping the dummy node)
            return dummy.next;
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


        ListNode ln2 = new ListNode(60);
        ln2.next = new ListNode(70);
        ln2.next.next = new ListNode(80);
        ln2.next.next.next= new ListNode(90);
        ln2.next.next.next.next= new ListNode(100);
        ln2.next.next.next.next.next= new ListNode(5);
        ln2.next.next.next.next.next.next= new ListNode(110);


        // Convert and print the linked list as a list
        System.out.println(toList(ln2));
        ListNode mergedList = new Solution().mergeTwoLists(ln, ln2);
        System.out.println(toList(mergedList));
    }

}
