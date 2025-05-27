package com.avg.demo.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array arr[] of size n, the task is to rearrange it in alternate positive and negative manner without
 * changing the relative order of positive and negative numbers. In case of extra positive/negative numbers,
 * they appear at the end of the array.
 * <p>
 * Note: The rearranged array should start with a positive number and 0 (zero) should be considered as a positive number.
 * <p>
 * <p>
 * Input:  arr[] = [1, 2, 3, -4, -1, 4]
 * Output: arr[] = [1, -4, 2, -1, 3, 4]
 * <p>
 * Input:  arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
 * Output: arr[] = [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
 */
public class RearrangeArrayElements {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));

        rearrange(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    //    The idea is to separate the numbers into positive and negative arrays. Then, alternately place numbers from each
    //    array back into the original array. Also place any remaining positive or negative numbers at the end.
    private static void rearrange(List<Integer> arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (Integer value : arr) {
            if (value >= 0) pos.add(value);
            else neg.add(value);
        }

        int posIdx = 0, negIdx = 0;
        int i = 0;

        // Place positive and negative numbers alternately
        // in the original array
        while (posIdx < pos.size() && negIdx < neg.size()) {
            if (i % 2 == 0)
                arr.set(i++, pos.get(posIdx++));
            else
                arr.set(i++, neg.get(negIdx++));
        }
        // Append remaining positive numbers (if any)
        while (posIdx < pos.size())
            arr.set(i++, pos.get(posIdx++));

        // Append remaining negative numbers (if any)
        while (negIdx < neg.size())
            arr.set(i++, neg.get(negIdx++));

    }

}

