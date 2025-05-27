package com.avg.demo.arrays.basic;

/**
 * Given an array arr[] consisting of only 0's and 1's, the task is to find the count of a maximum number of consecutive 1's or 0's present in the array.
 * Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
 * Output: 4
 * Explanation: The maximum number of consecutive 1's in the array is 4 from index 8-11.
 * <p>
 * Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
 * Output: 2
 * Explanation: The maximum number of consecutive 0's in the array is 2 from index 0-1.
 * <p>
 * Input: arr[] = {0, 0, 0, 0}
 * Output: 4
 * Explanation: The maximum number of consecutive 0's in the array is 4.
 */
public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maximumConsecutiveOnes(arr));
    }

    // The idea is to traverse the array while keeping track of the current streak of consecutive 1s or 0s.
    //  If the sequence is broken, update the maximum count and reset the current count.
    //      Using Simple Traversal - O(n) Time and O(1) Space
    private static int maximumConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) count++;
            else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
