package com.example.util;

public class StringUtil {
    public static String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] output = str.toCharArray();
        int start = 0;
        int end = output.length - 1;

        while (start < end) {
            if (!Character.isLetter(output[start])) {
                start++;
            } else if (!Character.isLetter(output[end])) {
                end--;
            } else {

                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;
            }
        }

        return new String(output);
    }
}