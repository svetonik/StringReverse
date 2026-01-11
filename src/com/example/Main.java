package com.example;
import com.example.util.StringUtil;

public class Main {
    public static void main(String[] args) {
        String original = "J@va the be$t!123";
        String reversed = StringUtil.reverseLetters(original);
        System.out.println("Input: " + original);
        System.out.println("Output: " + reversed);
    }
}
