package com.ykushch.solution.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Rotate the array A by B positions.
 *
 * Example:
 * A : [1 2 3 4 5 6]
 * B : 1
 *
 * The output :
 * [2 3 4 5 6 1]
 */
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
