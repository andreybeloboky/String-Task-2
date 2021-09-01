package com.company;

public class StringIsBlank {
    /**
     * @param str - users text;
     * @return if string have 0 elements enter true and vice versa;
     */
    public static boolean isBlank (String str){
        boolean str2 = true;
        char[] charToString = str.toCharArray();
        for (char c : charToString) {
            if (c != ' ') {
                return false;
            }
        }
        return str2;
    }
}
