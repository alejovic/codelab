package com.avg.demo.arrays.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        Arrays.sort(arr);
        System.out.println("Arrays.sort: " + Arrays.toString(arr));

        Integer[] list = new Integer[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        // redundant...
        Arrays.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer value1, Integer value2) {
                return value2 - value1;
            }
        });
        System.out.println("Comparator: " + Arrays.toString(list));

    }

}
