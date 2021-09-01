package com.company;

public class StringJoin {
    /**
     * @param indent - spaces between string;
     * @param str    - vararg, array from string;
     * @return string join with everything strings;
     */
    public static String join(String indent, String... str) {
        String str1 = new String();
        for (String s : str) {
            str1 += s + indent;
        }
        return str1;
    }
}