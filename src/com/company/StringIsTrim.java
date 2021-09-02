package com.company;

public class StringIsTrim {
    /**
     * @param str13 - users text;
     * @return text without space;
     */
    public static String trim(String str13) {
        char[] charToString = str13.toCharArray();
        int start = 0;
        int end = charToString.length;
        for (char c : charToString) {
            if (c != ' ') {
                break;
            }
            start++;
        }
        for (int i = charToString.length - 1; i > 0; i--) {
            if (charToString[i] != ' ') {
                break;
            }
            end--;
        }
        String stringTrim = String.valueOf(charToString);
        stringTrim = stringTrim.substring(start, end);
        return stringTrim;
    }
}
