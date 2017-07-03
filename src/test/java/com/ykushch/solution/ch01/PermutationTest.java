package com.ykushch.solution.ch01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {
    @Test
    public void shouldReturnTrueWhenPermutationIsCorrect() throws Exception {
        boolean isPermutation = Permutation.isPermutation("abbc", "cabb");
        Assertions.assertThat(isPermutation).isEqualTo(true);

    }

    @Test
    public void shouldReturnTrueWhenPermutationIsCorrectUsingCount() throws Exception {
        boolean isPermutation = Permutation.isPermutationUsingCount("abbc", "cabb");
        Assertions.assertThat(isPermutation).isEqualTo(true);

    }

}