package com.ykushch.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a large array of integers and a window of size 'w', find the current maximum in the window as the window slides through
 * the entire array.
 *
 */
public class MaxSlidingWindow {

    public void find(int[] arr, int windowSize) {
        if (arr.length < windowSize) {
            throw new RuntimeException("Cannot work with window larger than actual array");
        }

        Deque<Integer> window = new ArrayDeque<>();
        for (int i = 0; i < windowSize; i++) {
            while (!window.isEmpty() && arr[i] >= arr[window.peekLast()]) {
                window.removeLast();
            }

            window.addLast(i);
        }

        System.out.println(arr[window.peekFirst()] + ", ");

        for (int i = windowSize; i < arr.length; i++) {
            while (!window.isEmpty() && arr[i] >= arr[window.peekLast()]) {
                window.removeLast();
            }

            if (!window.isEmpty() && window.peekFirst() <= i - windowSize) {
                window.removeFirst();
            }

            window.addLast(i);
            System.out.println(arr[window.peekFirst()] + ", ");
        }
    }
}
