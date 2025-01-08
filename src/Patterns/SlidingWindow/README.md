When we are dealing with problems that require checking answers of some ranges in an array, the Sliding window algorithm can be a very powerful technique.


### Key Points to identify Sliding Window Problems
- These problems generally evolve around Finding Maximum / Minimum Subarray, Substrings which satisfy some specific condition.
- The size of the subarray or substring 'K' will be given or asked in some of the problems.
- These problem can easily be solved in O(n2) time complexity using nested loops, using sliding window we can solve these in O(n) Time Complexity.
- Required Time Complexity: O(n) or O(nlog(n))
- Constraints: n <= 10^6 , If n is the size of the Array / String.

### Types of Sliding Window
There are generally two types of Sliding Window Problems
- Fixed Size
- Variable Size

## Fixed Size Sliding Window
There are two ways to find if the problem is Fixed Size Sliding Window Problem or not.
- Type 1: Problems where we are generally given a specific size of window 'K' in the question itself.
  - **For example**: Given an array of integers and a number K, find the maximum sum of a subarray of size K.
  - **Intuition**: In this question we already given the size of the subarray we just have to iterate in the array and calculate the sum of each subarray of size k with sliding window technique.
- Type 2: Problems in which rather than giving the length question ask about the maximum / minimum fixed length then we can also apply the fixed size sliding window technique.
  - **For example**: Maximum subarray size, such that all subarrays of that size have sum less than K.
  - **Intuition**: In this question we have to find the maximum size of the subarray which satisfy the given condition. In these type of questions we can apply Binary Search on Answer + Sliding Window to solve the question, We can find our possible size of subarray by applying binary search on subarray size and find the condition validation using sliding window of fixed size K , which will be equal to mid value in Binary Search.

| PROBLEM                                                     | LINK  |
|-------------------------------------------------------------|-------|
|  |       |


## Variable Size Sliding Window
In these sliding window questions we have been asked about the maximum or minimum subarray/substring with some conditions (like having largest sum, smallest sum etc.)
- **For Example**: Find length of the longest substring without repeating characters.
- **Intuition**: To solve the problems based on the above category follow the below intuition steps:
  - In these kind of problems we can increase right pointer till we found some character (say 'x') which is already in our range, store the answer and increase left pointer till we found that character ('x') again, We can keep moving forward and store the answer.
  - As we can see in this question our window size is variable so that's why these problems are called variable size sliding window problem.





### References
```
https://www.geeksforgeeks.org/sliding-window-problems-identify-solve-and-interview-questions/
```