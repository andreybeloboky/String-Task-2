package com.company;

public class StringIsToUpperCase {
    /**
     * @param str - users text;
     * @return return all symbol uppercase;
     */
    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] = (char) (charArray[i] - 32);
            } else {
                charArray[i] = charArray[i];
            }
        }
        return String.valueOf(charArray);
    }
}
