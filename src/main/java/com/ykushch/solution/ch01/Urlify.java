package com.ykushch.solution.ch01;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: if implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 *
 * EXAMPLE
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 */
public class Urlify {
    public static void make(char[] str, int trueLength) {
        int numberOfWhitespaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                numberOfWhitespaces++;
            }
        }

        int index = trueLength + numberOfWhitespaces * 2;
        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }

        for (int i = trueLength - 1; i >= 0; i--) {
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static String make(String str) {
        String processedStr = str.trim();
        return processedStr.replace(" ", "%20");
    }
}
