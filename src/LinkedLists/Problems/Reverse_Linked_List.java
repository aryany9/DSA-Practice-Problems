package LinkedLists.Problems;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Linked_List {

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


     // Method to reverse the linked list
    /* Questions that comes in Mind while solving the problem.
    * How to calculate the size of the linkedList? for "for" loop.
    * Should this can be solved with do-while or for loop?
    * How to reverse now? Converting to Array? or
    * */
     public static ListNode reverseList(ListNode head) {
         // Three pointer approach
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
         ListNode temp = null;
         ListNode next = null;
         while (head != null) {
             temp = head.next; // Temporary storing next node
             head.next = next; // Nullifying the next node
             next = head; // Pointing to the previous node
             head = temp; // Incrementing the next node
         }
         return next;

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
