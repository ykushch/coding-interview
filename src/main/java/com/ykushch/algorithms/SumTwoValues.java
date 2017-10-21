package com.ykushch.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers and a value, determine if there are any two integers in the array which sum equal to the given value.
 */
public class SumTwoValues {

    public boolean sum(int[] arr, int val) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int el : arr) {
            if (set.contains(val - el)) {
                return true;
            }
            set.add(el);
        }

        return false;
    }

    public boolean sumWithoutHashSetOnSortedArray(int[] arr, int val) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int sum = arr[left] + arr[right];
            if (sum == val) {
                return true;
            }

            if (sum < val) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
