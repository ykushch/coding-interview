package com.ykushch.algorithms.ch01.stack;

/**
 * First version of stack. Capacity stack that is using underline the array to store elements.
 *
 * FixedCapacityStack(int cap) create an empty stack of capacity cap
 *
 * void push(String item) add a string
 * String pop() remove the most recently added string
 * boolean isEmpty() is the stack empty?
 * int size() number of strings on the stack
 */
public class FixedCapacityStack<T> {
    private T[] arr;
    private int numberOfElems;

    public FixedCapacityStack(int cap) {
        arr = (T[]) new Object[cap];
    }

    public void push(T item) {
        arr[numberOfElems++] = item;
    }

    public T pop() {
        return arr[--numberOfElems];
    }

    public boolean isEmpty() {
        return numberOfElems == 0;
    }

    public int size() {
        return numberOfElems;
    }
}
