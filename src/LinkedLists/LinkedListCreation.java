package LinkedLists;

import java.util.LinkedList;

public class LinkedListCreation {

    // CREATION of NODE
    static class Node {
        int data; // Current Node's Data
        Node next; // Pointer to Next Node

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Initially both head and tail are not
    // pointing to any other node
    static Node head = null;
    static Node tail = null;

    // Method to add New Node to Linked List
    static void addNode(int data){
        Node newNode = new Node(data);

        // Checks if the list is empty
        if(head == null){
            /*
            * If the list is empty, both head
            * and tail will point to new node
            * */
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            // Storing new node in tail
            tail = newNode;
        }
    }

    // Method to Count Nodes
    static int countNodes(){
        // Initially Zero
        int count = 0;

        Node currentNode = head;

        // Iterate until all the nodes are present
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }

        // Return the count
        return count;
    }

    static void displayNodes(){
        Node currentNode = head;

        if(head == null){
            System.out.println("Empty");
            return;
        }
        System.out.println("Nodes: ");
        while(currentNode != null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        };
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        displayNodes();
        System.out.println("Total Nodes: "+countNodes());

        // Creating a Linked List
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.add("Four");
        ll.add("Five");



        // Adding an element at particular index doesn't replace the element.
        ll.add(2, "ThreeTwo");

        // Printing the LinkedList
        System.out.println(ll);
    }

}
