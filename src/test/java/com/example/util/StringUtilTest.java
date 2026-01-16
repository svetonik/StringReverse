package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {@Test
void testReverseLetters() {
    String input = "Java";
    String expected = "avaJ";

    String actual = StringUtil.reverseLetters(input);

    assertEquals(expected, actual, "Метод должен переворачивать буквы в слове");
}
    @Test
    void testReverseOnlySymbols() {
        String input = "123!@#";
        String expected = "123!@#";

        String actual = StringUtil.reverseLetters(input);

        assertEquals(expected, actual, "Символы и цифры должны остаться на своих местах");
    }
    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";

        String actual = StringUtil.reverseLetters(input);

        assertEquals(expected, actual, "Пустая строка должна остаться пустой");
    }
    @Test
    void testReverseSingleSpace() {
        String input = " ";
        String expected = " ";

        String actual = StringUtil.reverseLetters(input);

        assertEquals(expected, actual, "Одиночный пробел должен остаться пробелом");
    }
}
