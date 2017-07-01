package com.ykushch.solution.ch01;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 *
 * We are assuming that this is ASCII and the max length of unique symbols could be 128 chars.
 *
 */
public class Unique {
    public static boolean isUniqueChars(String str) {
        if(str.length() > 128) {
            return false;
        }

        boolean[] charArr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            // found in string already
            if(charArr[val]) {
                return false;
            }
            charArr[val] = true;
        }

        return true;
    }
}
