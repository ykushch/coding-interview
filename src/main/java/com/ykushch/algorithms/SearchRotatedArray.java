package com.ykushch.algorithms;

/**
 * Search a given number in a sorted array that has been rotated by some arbitrary number.
 */
public class SearchRotatedArray {

    public int find(int[] arr, int key) {
        return searchRecursively(arr, 0, arr.length - 1, key);
    }

    private int searchRecursively(int[] arr, int st, int end, int key) {
        if (st > end) {
            return -1;
        }

        int mid = st + ((end - st) / 2);

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[st] < arr[mid] && key < arr[mid] && key >= arr[st]) {
            return searchRecursively(arr, st, mid - 1, key);
        }

        if (arr[mid] < arr[end] && key > arr[mid] && key <= arr[end]) {
            return searchRecursively(arr, mid + 1, end, key);
        }

        if (arr[st] > arr[mid]) {
            return searchRecursively(arr, st, mid - 1, key);
        }

        if (arr[end] < arr[mid]) {
            return searchRecursively(arr, mid + 1, end, key);
        }

        return -1;
    }

}
