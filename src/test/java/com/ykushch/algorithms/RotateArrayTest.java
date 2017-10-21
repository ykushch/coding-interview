package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RotateArrayTest {

    @Test
    public void rotate() throws Exception {
        RotateArray ra = new RotateArray();
        List<Integer> arr = Arrays.asList(5, 2, 3, 4);
        ra.rotate(arr, 1);
        Assertions.assertThat(arr).isEqualTo(Arrays.asList(4, 5, 2, 3));
    }

    @Test
    public void testRotateWithTempArray() throws Exception {
        RotateArray ra = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ra.rotateWithTempArray(arr, -3);
        Assertions.assertThat(arr).isEqualTo(new int[]{4, 5, 6, 7, 8, 1, 2, 3});
    }
}