package com.ykushch.algorithms;

/**
 * Given a sorted array of integers, return the low and high index of the given key. Return -1 if not found.
 * The array length can be in millions with lots of duplicates.
 *
 */
public class LowHighIndex {

    public int findLow(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = high / 2;

        while (low <= high) {
            int midElem = arr[mid];

            if (midElem < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = low + ((high - low) / 2);
        }

        if (arr[low] == key) {
            return low;
        }

        return -1;
    }

    public int findHigh(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = high / 2;

        while (low <= high) {
            int midElem = arr[mid];

            if (midElem <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = low + ((high - low) / 2);
        }

        if (arr[high] == key) {
            return high;
        }

        return -1;
    }

}
