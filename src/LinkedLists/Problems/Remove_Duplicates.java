package LinkedLists.Problems;

import java.util.ArrayList;

/*
       Remove Duplicates from Sorted List.
       Your task is to delete all duplicates such that each
       element appears only once and return the linked list sorted.
     */
public class Remove_Duplicates {

    // Manual Creation of Linked List (Node)
    private static class Node {
        int data;
        Node next;

        // Empty initialization of linked list
        Node(){
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node add(Node head, int data){
            // Create a new node
            Node newNode = new Node(data);

            // if the list is empty, make the new node
            // as the head and return
            if(head == null){
                return newNode;
            }

            Node last = head;

            // Traverse till the end node
            while(last.next != null){
                last = last.next;
            }

            // Change the next pointer of the last node
            // To point to the new node.
            last.next = newNode;

            // Return the head of the list
            return head;
        }

        void displayList(Node head){
            ArrayList<Integer> linkedlist = new ArrayList<>();
            while (head != null){
                linkedlist.add(head.data);
                head = head.next;
            }
            System.out.println(linkedlist);
        }
    }

    private static class Solution {
        Node removeDuplicates(Node head){
            Node sortedLinkedList = new Node();
            while (head.next!= null){
                if(head.data < head.next.data){
                    sortedLinkedList.add(head,head.data);
                }
                head = head.next;
            }
            sortedLinkedList.displayList(head);
            return sortedLinkedList;
        }

    }

        public static void main(String[] args) {
            // Creating Linked List
            Node linkedList = new Node(); // <-- HEAD
            Node head = new Node(10);
            linkedList.add(head, 20);
            linkedList.add(head, 70);
            linkedList.add(head, 30);
            linkedList.add(head, 30);
            linkedList.add(head, 40);
            linkedList.add(head, 50);
            linkedList.add(head, 60);
            linkedList.add(head, 60);
            linkedList.add(head, 60);

            // Display the linkedlist created
            linkedList.displayList(head);

            Node sortedList = new Solution().removeDuplicates(head);
            linkedList.displayList(sortedList);
        }

}
