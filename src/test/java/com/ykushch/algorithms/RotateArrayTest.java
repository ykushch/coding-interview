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
}