package com.threecoffee.solution.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Spiral {

    private enum Direction {
        UP, LEFT, DOWN, RIGHT
    }

    public static List<Integer> spiralOrder(final List<ArrayList<Integer>> inputMatrix) {
        if (isValid(inputMatrix)) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        int topIndex = 0;
        int leftIndex = 0;
        int rightIndex = inputMatrix.get(0).size() - 1;
        int bottomIndex = inputMatrix.size() - 1;

        Direction direction = Direction.RIGHT;

        while (topIndex <= bottomIndex && leftIndex <= rightIndex) {
            switch (direction) {
                case RIGHT:
                    for (int i = leftIndex; i <= rightIndex; i++) {
                        int element = inputMatrix.get(leftIndex).get(i);
                        result.add(element);
                    }
                    topIndex++;
                    direction = Direction.DOWN;
                    break;
                case DOWN:
                    for (int i = topIndex; i <= bottomIndex; i++) {
                        int element = inputMatrix.get(i).get(rightIndex);
                        result.add(element);
                    }
                    rightIndex--;
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    for (int i = rightIndex;  i >= leftIndex; i--) {
                        int element = inputMatrix.get(bottomIndex).get(i);
                        result.add(element);
                    }
                    bottomIndex--;
                    direction = Direction.UP;
                    break;
                case UP:
                    for(int i = bottomIndex; topIndex <= i; i--) {
                        int element = inputMatrix.get(i).get(leftIndex);
                        result.add(element);
                    }
                    leftIndex++;
                    direction = Direction.RIGHT;
                    break;
            }
        }

        return result;
    }

    private static boolean isValid(List<ArrayList<Integer>> inputMatrix) {
        if(inputMatrix == null) {
            return true;
        }

        for (List<Integer> list : inputMatrix) {
            if(list == null) {
                throw new IllegalArgumentException("Null values are not allowed");
            }
        }
        return false;
    }

}
