package com.avg.demo.arrays.sorting;

import java.util.Arrays;

/**
 * Idea: Find the minimum element and move it to the beginning.
 * <p>
 * Time Complexity: O(n²)
 * In-place: Yes
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        SelectionSort.sort(arr);
        System.out.println("SelectionSort: " + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
