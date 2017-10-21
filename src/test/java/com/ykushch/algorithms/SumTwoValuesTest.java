package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTwoValuesTest {

    @Test
    public void testDumWithoutHashSetOnSortedArray() throws Exception {
        SumTwoValues stv = new SumTwoValues();
        boolean isSumForGivenVal = stv.sumWithoutHashSetOnSortedArray(new int[]{1, 3, 4, 5, 7, 14, 15}, 11);
        Assertions.assertThat(isSumForGivenVal).isTrue();
    }

    @Test
    public void testSum() throws Exception {
        SumTwoValues stv = new SumTwoValues();
        boolean isSumForGivenVal = stv.sum(new int[]{5, 7, 1, 2, 8, 4, 3}, 10);
        Assertions.assertThat(isSumForGivenVal).isTrue();
    }

}