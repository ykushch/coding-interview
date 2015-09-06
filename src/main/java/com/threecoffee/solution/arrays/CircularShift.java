package com.threecoffee.solution.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularShift {

    public static List<Integer> rotateArray(List<Integer> inputList, int shiftFactor) {
        List<Integer> result = new ArrayList<>();
        if(inputList == null || inputList.isEmpty()) {
            return Collections.emptyList();
        }

        for(int i = 0; i < inputList.size(); i++) {
            result.add(getProperElement(inputList, i, shiftFactor));
        }
        return result;
    }

    private static Integer getProperElement(List<Integer> inputList, int index, int shiftFactor) {
        return inputList.get((index + shiftFactor) % inputList.size());
    }
}
