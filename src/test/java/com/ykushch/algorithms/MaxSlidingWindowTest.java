package com.ykushch.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSlidingWindowTest {

    @Test
    public void find() throws Exception {
        MaxSlidingWindow window = new MaxSlidingWindow();
        window.find(new int[] {-4, 2, -5, 3, 6}, 3);
    }

}