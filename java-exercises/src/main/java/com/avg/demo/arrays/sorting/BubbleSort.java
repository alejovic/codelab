package com.avg.demo.arrays.sorting;

import java.util.Arrays;

/**
 * Idea: Repeatedly swap adjacent elements if they are in the wrong order.
 * <p>
 * Time Complexity: O(n²)
 * Best for: Small or nearly sorted arrays.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        BubbleSort.sort(arr);
        System.out.println("BubbleSort: " + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}
