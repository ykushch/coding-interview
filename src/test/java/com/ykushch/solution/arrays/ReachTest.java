package com.ykushch.solution.arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class ReachTest {

    @Spy
    ArrayList<Integer> x = new ArrayList<>();

    @Spy
    ArrayList<Integer> y = new ArrayList<>();

    @Test
    public void testCoverPoints() throws Exception {
        x.addAll(Arrays.asList(0, 1, 1));
        y.addAll(Arrays.asList(0, 1, 2));
        int moves = Reach.coverPoints(x, y);
        Assertions.assertThat(moves).isEqualTo(2);
    }

    @Test
    public void testCoverPointsDecreasing() throws Exception {
        x.addAll(Arrays.asList(-7, -13));
        y.addAll(Arrays.asList(1, -5));
        int moves = Reach.coverPoints(x, y);
        Assertions.assertThat(moves).isEqualTo(6);
    }

    @Test
    public void testCoverPointsDecreasingLarge() throws Exception {
        x.addAll(Arrays.asList(4, 8, -7, -5, -13, 9, -7, 8));
        y.addAll(Arrays.asList(4, -15, -10, -3, -13, 12, 8, -8));
        int moves = Reach.coverPoints(x, y);
        Assertions.assertThat(moves).isEqualTo(108);
    }
}
