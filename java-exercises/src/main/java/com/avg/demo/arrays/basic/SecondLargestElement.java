package com.avg.demo.arrays.basic;

import java.util.Arrays;

/**
 * Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
 * <p>
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * <p>
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 * <p>
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 there is no second largest element.
 */
// @see SecondHighestInArray fpr a clean solution.
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargestWithSort(array));
    }

    private static int findSecondLargestWithSort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    private static int findSecondLargest(int[] arr) {
        int firstLargest = -1;
        for (int i : arr) {
            if (i > firstLargest) {
                firstLargest = i;
            }
        }
        System.out.println("firstLargest: " + firstLargest);

        int secondLargest = -1;
        for (int i : arr) {
            if (i > secondLargest && i < firstLargest) {
                secondLargest = i;
            }
        }
        System.out.println("secondLargest: " + secondLargest);
        return secondLargest;
    }
}
