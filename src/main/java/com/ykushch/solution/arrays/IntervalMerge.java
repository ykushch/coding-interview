package com.ykushch.solution.arrays;

import com.ykushch.solution.arrays.entity.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * You may assume that the intervals were initially sorted according to their start times.
 *
 * Example 1:
 * Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
 *
 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] -> [1,2],[3,10],[12,16].
 *
 * In this example interval [4,9] overlaps with [3,5],[6,7],[8,10].
 */
public class IntervalMerge {

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals == null || intervals.isEmpty()) {
            return Collections.singletonList(newInterval);
        }

        normalizeInput(intervals, newInterval);
        intervals.add(newInterval);
        intervals.sort((first, second) -> Integer.compare(first.getStart(), second.getStart()));
        return mergeOverlapping(intervals);
    }

    private static void normalizeInput(List<Interval> intervals, Interval newInterval) {
        normalizeIntervals(intervals);
        normalizeInterval(newInterval);
    }

    private static void normalizeIntervals(List<Interval> intervals) {
        for(Interval interval : intervals) {
            normalizeInterval(interval);
        }
    }

    private static void normalizeInterval(Interval newInterval) {
        if(newInterval.getStart() > newInterval.getEnd()) {
            int start = newInterval.getStart();
            newInterval.setStart(newInterval.getEnd());
            newInterval.setEnd(start);
        }
    }

    private static List<Interval> mergeOverlapping(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));

        for(int i = 1, length = intervals.size() - 1; i <= length; i++) {
            Interval top = result.get(result.size() - 1);
            Interval mergableInterval = intervals.get(i);

            if(areOverlap(top, mergableInterval)) {
                Interval interval = new Interval(Math.min(top.getStart(), mergableInterval.getStart()),
                        Math.max(top.getEnd(), mergableInterval.getEnd()));
                // just update the added interval
                top.setStart(interval.getStart());
                top.setEnd(interval.getEnd());
            } else {
                result.add(mergableInterval);
            }
        }

        return result;
    }

    private static boolean areOverlap(Interval firstInterval, Interval mergableInterval) {
        return !(Math.max(firstInterval.getStart(), mergableInterval.getStart())
                > Math.min(firstInterval.getEnd(), mergableInterval.getEnd()));
    }
}
