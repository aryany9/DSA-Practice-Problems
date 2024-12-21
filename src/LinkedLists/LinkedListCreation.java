package LinkedLists;

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
    Node head = null;
    Node tail = null;


    // Method to Count Nodes
    int countNodes(){
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

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        System.out.println(node.data);
        System.out.println(node.next.data);
    }

}
