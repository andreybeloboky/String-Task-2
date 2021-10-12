package com.company;

public class StringIsTrim {
    /**
     * @param str - users text;
     * @return text without space;
     */
    public static String trim(String str) {
        char[] charToString = str.toCharArray();
        int start = 0;
        int end = charToString.length;
        int i = 0;
        while (charToString[i] == ' ') {
            i++;
            start++;
        }
        int j = charToString.length - 1;
        while (charToString[j] == ' ') {
            j--;
            end--;
        }
        String stringTrim = String.valueOf(charToString);
        stringTrim = stringTrim.substring(start, end);
        return stringTrim;
    }
}
