package com.ykushch.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchRotatedArrayTest {

    @Test
    public void testFind() throws Exception {
        SearchRotatedArray sra = new SearchRotatedArray();
        int i = sra.find(new int[]{176, 188, 199, 200, 210, 222, 1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162}, 200);
        Assertions.assertThat(i).isEqualTo(3);
    }

}