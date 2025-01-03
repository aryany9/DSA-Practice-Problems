package DataStructures.LinkedLists.Problems;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Linked_List {

     private static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


     // Method to reverse the linked list
     private static ListNode reverseList(ListNode head) {
         // For Loop Approach
         /*
             ListNode prev = null;
             ListNode current = head;
             ListNode next = null;

             // For loop to reverse the linked list
             for (; current != null; current = next) {
                 next = current.next;  // Store the next node
                 current.next = prev;  // Reverse the current node's pointer
                 prev = current;       // Move the prev pointer forward
             }
             return prev; // New head of the reversed list
         */

         // While Loop Approach
         ListNode next;
         ListNode prev = null;
         while (head != null) {
             next = head.next; // Temporary storing next node
             head.next = prev; // Nullifying the current next node
             prev = head; // adding current to the previous node
             head = next; // replacing current to the next node
         }
         return prev;

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


    public static void main(String[] args) {
        ListNode ln = new ListNode(10);
        ln.next = new ListNode(20);
        ln.next.next = new ListNode(30);
        ln.next.next.next= new ListNode(40);
        ln.next.next.next.next= new ListNode(50);

        // Convert and print the linked list as a list
        System.out.println(toList(ln));

        ListNode reversedList = reverseList(ln);

        System.out.println(toList(reversedList));

    }

}
