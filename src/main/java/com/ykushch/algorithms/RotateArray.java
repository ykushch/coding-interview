package com.ykushch.algorithms;

import java.util.List;

/**
 * Given an array of integers, rotate the array by 'N' elements.
 *
 */
public class RotateArray {

    public void rotate(List<Integer> arr, int n) {
        int len = arr.size();
        int correctedN = n % len;

        if (correctedN < 0) {
            correctedN += len;
        }

        // rotate all array
        rotateArray(arr, 0, len - 1);
        // rotate from start to the number of rotations
        rotateArray(arr, 0, correctedN - 1);
        // rotate everything else
        rotateArray(arr, correctedN, len - 1);
    }

    private void rotateArray(List<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
