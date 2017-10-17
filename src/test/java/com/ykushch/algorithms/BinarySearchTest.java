package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearchIteratively() throws Exception {
        BinarySearch binarySearch = new BinarySearch();
        int keyToFind = 5;
        int indexOfKey = binarySearch.searchIteratively(new int[]{1, 2, 4, 5, 6, 7, 9, 10, 12, 15, 16}, keyToFind);
        Assertions.assertThat(indexOfKey).isEqualTo(3);
    }

    @Test
    public void testBinarySearchRecursive() throws Exception {
        BinarySearch binarySearch = new BinarySearch();
        int keyToFind = 5;
        int indexOfKey = binarySearch.searchRecursively(new int[]{1, 2, 4, 5, 6, 7, 9, 10, 12, 15, 16}, keyToFind);
        Assertions.assertThat(indexOfKey).isEqualTo(3);
    }
}