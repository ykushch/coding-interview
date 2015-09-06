package com.threecoffee.solution.arrays;

import java.util.ArrayList;

public class Reach {

    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for(int i = 0; i < X.size() - 1; i++){
            int absX = Math.abs(X.get(i) - X.get(i+1));
            int absY = Math.abs(Y.get(i) - Y.get(i+1));
            // get the maximum from absX or absY.
            // actually it will be the number of steps.
            numSteps += Math.max(absX, absY);
        }
        return numSteps;
    }
}
