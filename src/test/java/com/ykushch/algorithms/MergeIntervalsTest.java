package com.ykushch.algorithms;

import com.ykushch.algorithms.model.Interval;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeIntervalsTest {

    @Test
    public void testMerge() throws Exception {
        MergeIntervals mi = new MergeIntervals();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 5));
        intervals.add(new Interval(3, 7));
        intervals.add(new Interval(4, 6));
        intervals.add(new Interval(6, 8));
        intervals.add(new Interval(10, 12));
        intervals.add(new Interval(11, 15));
        List<Interval> mergedIntervals = mi.merge(intervals);
        Assertions.assertThat(mergedIntervals).isEqualTo(Arrays.asList(new Interval(1, 8), new Interval(10, 15)));
    }

}