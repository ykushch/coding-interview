package com.threecoffee.solution.arrays.entity;

public class Interval {
    private int start = 0;
    private int end = 0;

    public Interval() {
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

