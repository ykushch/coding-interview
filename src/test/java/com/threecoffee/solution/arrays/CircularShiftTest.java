package com.threecoffee.solution.arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CircularShiftTest {

    @Spy
    List<Integer> integerList = new ArrayList<>();

    @Test
    public void testRotateArray() throws Exception {
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> result = CircularShift.rotateArray(integerList, 1);
        Assertions.assertThat(result).isEqualTo(Arrays.asList(2, 3, 4, 5, 6, 1));
    }
}
