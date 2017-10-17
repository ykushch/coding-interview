package com.ykushch.algorithms;

/**
 * Given a sorted array of integers, return the index of the given key. Return -1 if not found.
 */
public class BinarySearch {

    public int searchRecursively(int[] arr, int key) {
        return search(arr, key, 0, arr.length - 1);
    }

    private int search(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return search(arr, key, low, mid - 1);
        } else {
            return search(arr, key, mid + 1, high);
        }
    }

    public int searchIteratively(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
