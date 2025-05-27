package com.avg.demo.arrays.basic;

import java.util.Arrays;

/**
 * Given an array arr[] and an integer k, the task is to reverse every subarray formed by consecutive K elements.
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3
 * Output: 3, 2, 1, 6, 5, 4, 9, 8, 7
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 5
 * Output: 5, 4, 3, 2, 1, 8, 7, 6
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6], k = 1
 * Output: 1, 2, 3, 4, 5, 6
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 10
 * Output: 8, 7, 6, 5, 4, 3, 2, 1
 */
public class ReverseArrayInGroups {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Example array
        int k = 3; // Number of positions to rotate
        reverseInGroups(arr, k);
        System.out.println("reverse array in k " + Arrays.toString(arr));
    }

    public static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            reverse(arr, start, end);
        }
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
