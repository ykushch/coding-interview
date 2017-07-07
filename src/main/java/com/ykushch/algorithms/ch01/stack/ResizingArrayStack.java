package com.ykushch.algorithms.ch01.stack;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] arr;
    private int numberOfElems;
    private int capacity = 10;

    public ResizingArrayStack() {
        arr = (T[]) new Object[capacity];
    }

    public void push(T item) {
        if (isFull()) {
            resize(2 * arr.length);
        }
        arr[numberOfElems++] = item;
    }

    public T pop() {
        T item = arr[--numberOfElems];
        arr[numberOfElems] = null;
        if (numberOfElems > 0 && numberOfElems == arr.length / 4) {
            resize(arr.length / 2);
        }
        return item;
    }

    public boolean isEmpty() {
        return numberOfElems == 0;
    }

    public int size() {
        return numberOfElems;
    }

    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        // should be replaced with System.arraycopy for more performant method
        for (int i = 0; i < numberOfElems; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return numberOfElems == arr.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = numberOfElems;

        public boolean hasNext() {
            return i > 0;
        }

        public T next() {
            return arr[--i];
        }

        public void remove() {
        }
    }
}
