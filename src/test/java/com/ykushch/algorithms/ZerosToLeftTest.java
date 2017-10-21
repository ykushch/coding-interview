package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZerosToLeftTest {

    @Test
    public void testMove() throws Exception {
        ZerosToLeft ztl = new ZerosToLeft();
        int[] arr = {1, 2, 5, 0, 6, 0, 84, 43, 23, 0, 5, 0};
        ztl.move(arr);
        Assertions.assertThat(arr).isEqualTo(new int[]{0, 0, 0, 0, 1, 2, 5, 6, 84, 43, 23, 5});
    }

}