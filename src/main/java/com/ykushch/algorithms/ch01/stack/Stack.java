package com.ykushch.algorithms.ch01.stack;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private Node first;
    private int n;

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        n--;
        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseListIterator();
    }

    private class ReverseListIterator implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        T item;
        Node next;
    }
}
