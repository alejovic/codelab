package com.avg.demo.arrays.basic;

/**
 * Given an integer array, find a maximum product of a triplet in the array.
 * Input:  arr[ ] = [10, 3, 5, 6, 20]
 * Output: 1200
 * Explanation: Multiplication of 10, 6 and 20
 * <p>
 * Input:  arr[ ] =  [-10, -3, -5, -6, -20]
 * Output: -90
 * <p>
 * Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
 * Output: 168
 */
public class MaximumProductTriplet {

    public static void main(String[] args) {
        int[] array = {10, 3, 5, 6, 20};
        System.out.println(maximumProductTriplet(array));
    }

    private static int maximumProductTriplet(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    max = Math.max(max, arr[i] * arr[j] * arr[k]);

        return max;
    }
}
