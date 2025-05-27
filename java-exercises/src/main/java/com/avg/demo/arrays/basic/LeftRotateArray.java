package com.avg.demo.arrays.basic;

/**
 * Given an Array of size N and a value K, around which we need to left rotate the array.
 * Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
 * Output: {3, 4, 5, 6, 1, 2}
 * Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}
 * <p>
 * Input: arr[] = {1, 2, 3}, d = 4
 * Output: {2, 3, 1}
 * Explanation: The array is rotated as follows:
 * <p>
 * After first left rotation, arr[] = {2, 3, 1}
 * After second left rotation, arr[] = {3, 1, 2}
 * After third left rotation, arr[] = {1, 2, 3}
 * After fourth left rotation, arr[] = {2, 3, 1}
 * <p>
 * This approach has a time complexity of O(N).
 */

import java.util.Arrays;

public class LeftRotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Example array
        int k = 2; // Number of positions to rotate
        leftRotate(arr, k);
        System.out.println("Left rotated array: " + Arrays.toString(arr));
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than the length of the array

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);


    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
