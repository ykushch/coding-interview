package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowHighIndexTest {

    @Test
    public void testFindLow() throws Exception {
        LowHighIndex lhi = new LowHighIndex();
        int low = lhi.findLow(new int[]{1, 2, 3, 5, 5, 5, 5, 5, 6, 7, 8}, 5);
        Assertions.assertThat(low).isEqualTo(3);
    }

    @Test
    public void testFindHigh() throws Exception {
        LowHighIndex lhi = new LowHighIndex();
        int high = lhi.findHigh(new int[]{1, 2, 3, 5, 5, 5, 5, 5, 6, 7, 8}, 5);
        Assertions.assertThat(high).isEqualTo(7);
    }

}