package com.avg.demo.arrays.search;

// time complexity to O(log N).
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            // Check if the target is present at mid
            if (arr[mid] == target) return mid;
                // If target greater, ignore the left half
            else if (arr[mid] < target) left = mid + 1;
                // If target is smaller, ignore the right half
            else right = mid - 1;
        }
        // Target not present in the array
        return -1;
    }
}
