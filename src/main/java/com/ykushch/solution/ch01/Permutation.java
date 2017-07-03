package com.ykushch.solution.ch01;

import java.util.Arrays;

/**
 * Check permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Permutation {
    public static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        return sort(a).equals(sort(b));
    }

    private static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean isPermutationUsingCount(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        int[] letters = new int[128];
        char[] chars = a.toCharArray();
        for(char c : chars) {
            letters[c]++;
        }

        for(int i = 0; i < b.length(); i++) {
            int c = b.charAt(i);
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }

        return true;
    }


}
