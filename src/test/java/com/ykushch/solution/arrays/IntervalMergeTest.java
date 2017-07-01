package com.ykushch.solution.arrays;

import com.ykushch.solution.arrays.entity.Interval;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class IntervalMergeTest {

    @Spy
    List<Interval> intervals = new ArrayList<>();

    @Test
    public void testInsert() throws Exception {
        Interval interval = new Interval(2, 5);
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        List<Interval> mergeResult = IntervalMerge.insert(intervals, interval);
        assertThat(mergeResult.size()).isEqualTo(2);
        assertThat(new Interval(1, 5)).isEqualToComparingFieldByField(mergeResult.get(0));
        assertThat(new Interval(6, 9)).isEqualToComparingFieldByField(mergeResult.get(1));
    }

    @Test
    public void testInsertWithNonNormalizeInput() throws Exception {
        Interval interval = new Interval(10, 8);
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 6));
        List<Interval> mergeResult = IntervalMerge.insert(intervals, interval);
        assertThat(mergeResult.size()).isEqualTo(3);
        assertThat(new Interval(1, 2)).isEqualToComparingFieldByField(mergeResult.get(0));
        assertThat(new Interval(3, 6)).isEqualToComparingFieldByField(mergeResult.get(1));
        assertThat(new Interval(8, 10)).isEqualToComparingFieldByField(mergeResult.get(2));
    }

    @Test
    public void testInsertWithWideInterval() throws Exception {
        Interval interval = new Interval(4, 15);
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(7, 8));
        intervals.add(new Interval(9, 12));
        intervals.add(new Interval(13, 14));
        intervals.add(new Interval(18, 19));
        List<Interval> mergeResult = IntervalMerge.insert(intervals, interval);
        assertThat(mergeResult.size()).isEqualTo(3);
        assertThat(new Interval(1, 2)).isEqualToComparingFieldByField(mergeResult.get(0));
        assertThat(new Interval(3, 15)).isEqualToComparingFieldByField(mergeResult.get(1));
        assertThat(new Interval(18, 19)).isEqualToComparingFieldByField(mergeResult.get(2));
    }

    @Test
    public void testInsertWithEmptyInterval() throws Exception {
        Interval interval = new Interval(1, 1);
        intervals.add(null);
        List<Interval> mergeResult = IntervalMerge.insert(new ArrayList<>(), interval);
        assertThat(mergeResult.size()).isEqualTo(1);
        assertThat(new Interval(1, 1)).isEqualToComparingFieldByField(mergeResult.get(0));
    }
}
