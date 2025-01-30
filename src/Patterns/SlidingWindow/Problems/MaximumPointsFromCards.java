package Patterns.SlidingWindow.Problems;

/*
    There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

    In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

    Your score is the sum of the points of the cards you have taken.

    Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

    Input: cardPoints = [1,2,3,4,5,6,1], k = 3
    Output: 12
    Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

 */
public class MaximumPointsFromCards {
    public static int maxScore(int[] cardPoints, int k){
        // Making Each Sum equals to Zero
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        // Calculating the sum of First Four Card Points
        for (int i = 0; i <= k-1; i++) {
            leftSum += cardPoints[i];
        }
        // Assigning maximum sum of beginning four cards
        maxSum = leftSum;

        // Initializing right index
        int rightIndex = cardPoints.length-1;

        // Calculating the sum of each Cards by decrementing the left and incrementing the right
        for (int i = k-1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, leftSum+rightSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;

        System.out.println("Max Sum: "+maxScore(arr, k));
    }
}
