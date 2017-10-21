package com.ykushch.algorithms;

import com.ykushch.algorithms.model.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Merge Overlapping Intervals.
 *
 * Example:
 *     (1, 5), (3, 7), (4, 6), (6, 8), (10, 12), (11, 15)
 *
 *     Should be:
 *     (1, 8), (10, 15)
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return Collections.emptyList();
        }

        List<Interval> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals.get(0));

        for(int i = 1; i < intervals.size(); i++) {
            int startFirst = intervals.get(i).getStart();
            int endFirst = intervals.get(i).getEnd();

            int mergedSize = mergedIntervals.size();
            Interval interval = mergedIntervals.get(mergedSize - 1);
            int endSecond = interval.getEnd();

            if (endSecond >= startFirst) {
                int longestEnd = Math.max(endFirst, endSecond);
                interval.setEnd(longestEnd);
            } else {
                mergedIntervals.add(new Interval(startFirst, endFirst));
            }
        }

        return mergedIntervals;
    }



}
