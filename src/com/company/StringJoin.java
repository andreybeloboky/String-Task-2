package com.company;

public class StringJoin {
    /**
     * @param indent - spaces between string;
     * @param str    - vararg, array from string;
     * @return string join with everything strings;
     */
    public static String join(String indent, String... str) {
        String str1 = new String();
        for (int i = 0; i < str.length; i++) {
            str1 += str[i] + indent;
        }
        return str1;
    }
}