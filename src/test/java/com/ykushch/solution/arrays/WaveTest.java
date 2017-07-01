package com.ykushch.solution.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class WaveTest {

    @Spy
    ArrayList<Integer> a = new ArrayList<>();

    @Test
    public void testWaveWithEvenArray() throws Exception {
        a.addAll(Arrays.asList(1, 2, 3, 4));
        List<Integer> comparable = new ArrayList<>(Arrays.asList(2, 1, 4, 3));
        List<Integer> result = Wave.wave(a);
        assertThat(result).isEqualTo(comparable);

    }

    @Test
    public void testWaveWithOddArray() throws Exception {
        a.addAll(Arrays.asList(5, 1, 3, 2, 4));
        List<Integer> comparable = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 5));
        List<Integer> result = Wave.wave(a);
        assertThat(result).isEqualTo(comparable);
    }
}
