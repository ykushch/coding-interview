package com.ykushch.algorithms.ch01.unionfind;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleUnionFindTest {
    @Test
    public void shouldFindValidComponentsWhenCorrectPairsAreSet() throws Exception {
        List<Pair<Integer>> pairs = Arrays.asList(
            new Pair<>(4, 3),
            new Pair<>(3, 8),
            new Pair<>(6, 5),
            new Pair<>(9, 4),
            new Pair<>(2, 1),
            new Pair<>(8, 9),
            new Pair<>(5, 0),
            new Pair<>(7, 2),
            new Pair<>(6, 1),
            new Pair<>(1, 0),
            new Pair<>(6, 7));
        SimpleUnionFind suf = new SimpleUnionFind(pairs, 10);
        Assertions.assertThat(suf.findNumberOfComponents()).isEqualTo(2);
    }

    @Test
    public void shouldCountCorrectlyWhenPairsArePassed() throws Exception {
        List<Pair<Integer>> pairs = Arrays.asList(
            new Pair<>(4, 3),
            new Pair<>(3, 8),
            new Pair<>(6, 5),
            new Pair<>(9, 4),
            new Pair<>(2, 1),
            new Pair<>(8, 9),
            new Pair<>(5, 0),
            new Pair<>(7, 2),
            new Pair<>(6, 1),
            new Pair<>(1, 0),
            new Pair<>(6, 7));
        SimpleUnionFind suf = new SimpleUnionFind(pairs, 10);
        Assertions.assertThat(suf.count()).isEqualTo(10);
    }

    @Test
    public void shouldFindWhenCorrectValuePassed() throws Exception {
        List<Pair<Integer>> pairs = Arrays.asList(
            new Pair<>(4, 3),
            new Pair<>(3, 8),
            new Pair<>(6, 5),
            new Pair<>(9, 4),
            new Pair<>(2, 1),
            new Pair<>(8, 9),
            new Pair<>(5, 0),
            new Pair<>(7, 2),
            new Pair<>(6, 1),
            new Pair<>(1, 0),
            new Pair<>(6, 7));
        SimpleUnionFind suf = new SimpleUnionFind(pairs, 10);
        Assertions.assertThat(suf.find(3)).isEqualTo(3);
    }

    @Test
    public void shouldBeNotConnectedWhenStart() throws Exception {
        List<Pair<Integer>> pairs = Arrays.asList(
            new Pair<>(4, 3),
            new Pair<>(3, 8),
            new Pair<>(6, 5),
            new Pair<>(9, 4),
            new Pair<>(2, 1),
            new Pair<>(8, 9),
            new Pair<>(5, 0),
            new Pair<>(7, 2),
            new Pair<>(6, 1),
            new Pair<>(1, 0),
            new Pair<>(6, 7));
        SimpleUnionFind suf = new SimpleUnionFind(pairs, 10);
        Assertions.assertThat(suf.isConnected(3, 4)).isEqualTo(false);
    }
}
