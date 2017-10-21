package com.ykushch.algorithms;

/**
 * Given an integer array, move all elements containing '0' to the left while maintaining the order of other elements in the array.
 * <p>
 * 1 2 3 4 0 5 6 0 7 0 8 9
 */
public class ZerosToLeft {

    public void move(int[] arr) {
        if (arr == null) {
            throw new RuntimeException("Array cannot be null");
        }

        int readIndex = arr.length - 1;
        int writeIndex = arr.length - 1;

        while (readIndex >= 0) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }
            readIndex--;
        }

        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }
    }
}
