package com.company;

public class StringJoin {
    /**
     * @param indent - spaces between string;
     * @param words    - vararg, array from string;
     * @return string join with everything strings;
     */
    public static String join(String indent, String... words) {
        String string = new String();
        for (String word : words) {
            string += word + indent;
        }
        return string;
    }
}