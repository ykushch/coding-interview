package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SmallestCommonNumberTest {

    @Test
    public void testFind() throws Exception {
        SmallestCommonNumber scm = new SmallestCommonNumber();
        int i = scm.find(new int[]{4, 5, 8, 15, 20, 33, 45},
                new int[]{-1, 4, 6, 7, 8, 9, 50},
                new int[]{1, 5, 8, 14});
        Assertions.assertThat(i).isEqualTo(8);
    }
}