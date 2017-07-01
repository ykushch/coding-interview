package com.ykushch.solution.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, sort the array into a wave like array and return it,
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5...
 *
 * Example
 *
 * Given [1, 2, 3, 4]
 *
 * One possible answer : [2, 1, 4, 3]
 * Another possible answer : [4, 1, 3, 2]
 */
public class Wave {

    public static List<Integer> wave(List<Integer> inputList) {
        if (inputList == null || inputList.isEmpty()) {
            return Collections.emptyList();
        }

        Collections.sort(inputList);
        List<Integer> result = new ArrayList<>();

        formWaveWithEvenPart(inputList, result);
        formWaveWithRightMostPart(inputList, result);

        return result;
    }

    private static void formWaveWithRightMostPart(List<Integer> inputList, List<Integer> result) {
        int rightMostElements = inputList.size() % 2;
        int inputLength = inputList.size();
        if (rightMostElements != 0) {
            for (int i = inputLength - rightMostElements; i <= inputLength - 1; i++) {
                result.add(inputList.get(i));
            }
        }
    }

    private static void formWaveWithEvenPart(List<Integer> inputList, List<Integer> result) {
        for (int i = 0, length = inputList.size() - 1; i < length; i += 2) {
            if (inputList.get(i) < inputList.get(i + 1)) {
                result.add(inputList.get(i + 1));
                result.add(inputList.get(i));
            } else {
                result.add(inputList.get(i));
                result.add(inputList.get(i + 1));
            }
        }
    }
}
