## What is Linked List?
Linked List is a **linear data structure** where the elements are **not stored in contiguous locations**. 
Every element is a **separate object** with a **data part** and **address part**.
The elements are linked using **pointers** and **addresses** and each element is known as **NODE**.

### EXAMPLE
#### Java program to add elements to LinkedList
```java
import java.util.LinkedList;

public class AddElements {
    
    // Main Method
    public static void main(DataStructures.String[] args) {
        // Creating a Linked List
        LinkedList<DataStructures.String> ll = new LinkedList<>();
        
        // Adding elements to the LinkedList using add() method
        ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.add("Four");
        ll.add("Five");
        
        // Printing the LinkedList
        System.out.println(ll);
    }
}
```
#### Output
```
[One, Two, Three, Four, Five]
```

### Types of Linked List
- **Singly Linked List**
  - Each node **points to next** node, last node **points to null**.
- **Doubly Linked List**
  - Each **node has two pointers** p and n.
  - p points to **previous node**, n points to the **next node**.
  - **last** node's n points to **null**.
- **Circular Linked List**
  - Each node **points to the next node**, **last node** points back to **first node**.
- **Circular-Doubly Linked List**
  - Each node **points to the next node** (n) and **previous node** (p).
  - **First** node's **(p)** points to the **last node**.
  - **Last** node's **(n)** points to the **first node**.

### Time Complexity
- Accessing a Node: O(n)
- Searching a Node: O(n)
- Inserting a Node: O(1)
- Removing a Node: O(1)

### How Does LinkedList work internally?
Since a LinkedList acts as a **dynamic array** where you **do not have to specify the size** while creating it. The size of the list **automatically increases** when we dynamically **add** or **remove** items. Internally the LinkedList is implemented using the **Doubly Linked List** data structure.

### Difference between LinkedList and Array
| Items              | LinkedList                                            | Array                                  |
|--------------------|-------------------------------------------------------|----------------------------------------|
| Data Structure     | Non-Contiguous                                        | Contiguous                             |
| Memory Allocation  | Typically allocated one by one to individual elements | Typically allocated to the whole array |
| Insertion/Deletion | Efficient                                             | Inefficient                            |
| Access             | Sequential                                            | Random                                 |
| Memory Usage       | More                                                  | Less                                   |
| Access Time        | O(n)                                                  | O(1)                                   |
| Insertion Time     | O(1)                                                  | O(n)                                   |
| Deletion Time      | O(1)                                                  | O(n)                                   |
| Flexibility        | High                                                  | Low                                    |




### References
```
https://www.geeksforgeeks.org/linked-list-java/
https://leetcode.com/discuss/study-guide/1800120/Become-Master-In-Linked-List
https://www.geeksforgeeks.org/linked-list-data-structure/
```