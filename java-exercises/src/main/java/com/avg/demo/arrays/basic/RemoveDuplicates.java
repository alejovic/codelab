package com.avg.demo.arrays.basic;

// Problem: Given a sorted array, remove the duplicates in place.
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize=removeDuplicates(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }
        return k + 1;
    }
}
