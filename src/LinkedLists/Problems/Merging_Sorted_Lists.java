//package LinkedLists.Problems;
//
//import java.util.ArrayList;
//import java.util.List;
//
///*
//    PROBLEM: Merge Two Sorted Lists
//    You are given the heads of two sorted linked lists list1 and list2.
//
//    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//    Return the head of the merged linked list.
//*/
//public class Merging_Sorted_Lists {
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//
//    // Method to convert linked list to list and print it
//    public static List<Integer> toList(ListNode head) {
//        List<Integer> result = new ArrayList<>();
//        ListNode current = head;
//        while (current != null) {
//            result.add(current.val);
//            current = current.next;
//        }
//        return result;
//    }
//
//    public static class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            int list1Length = 0;
//            int list2Length = 0;
//
//            ListNode list1Current = list1;
//            ListNode list2Current = list2;
//
//            // Calculating Length of List 1
//            while (list1Current != null){
//                list1Length++;
//                list1Current = list1Current.next;
//            }
//
//            // Calculating Length of List 2
//            while (list2Current != null){
//                list2Length++;
//                list2Current = list2Current.next;
//            }
//
//            // Resetting current nodes
//            list1Current = list1;
//            list2Current = list2;
//            ListNode mergedList = null;
//
//            while (list1Current != null && list2Current != null){
//                ListNode temp1 =  list1Current;
//                ListNode temp2 = list2Current;
//
//                if(list1Current.next != null){
//                    list1Current = list1Current.next;
//                }
//                if(list2Current.next != null){
//                    list2Current = list2Current.next;
//                }
//                if(mergedList != null){
//                    if(temp1.val < temp2.val){
//                        mergedList.next = temp1;
//                    } else {
//                        mergedList.next = temp2;
//                    }
//                } else {
//                    if(temp1.val < temp2.val){
//                        mergedList = temp1;
//                    } else {
//                        mergedList = temp2;
//                    }
//                }
//            }
//            return mergedList;
////
////            for (int i = 0; i < list1Length; i++) {
////                for (int j = 0; j < list2Length; j++) {
////
////                }
////            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ListNode ln = new ListNode(10);
//        ln.next = new ListNode(20);
//        ln.next.next = new ListNode(30);
//        ln.next.next.next= new ListNode(40);
//        ln.next.next.next.next= new ListNode(50);
//
//        // Convert and print the linked list as a list
//        System.out.println(toList(ln));
//
//
//        ListNode ln2 = new ListNode(60);
//        ln2.next = new ListNode(70);
//        ln2.next.next = new ListNode(80);
//        ln2.next.next.next= new ListNode(90);
//        ln2.next.next.next.next= new ListNode(100);
//
//
//        // Convert and print the linked list as a list
//        System.out.println(toList(ln2));
//
//        System.out.println(toList(new Solution().mergeTwoLists(ln, ln2)));
//    }
//
//}
