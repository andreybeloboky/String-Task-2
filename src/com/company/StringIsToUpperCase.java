package com.company;

public class StringIsToUpperCase {
    /**
     *
     * @param str - users text;
     * @return return all symbol uppercase;
     */
    public static String toUpperCase(String str) {
        char[] str15ToCharArray = str.toCharArray();
        for (int i = 0; i < str15ToCharArray.length; i++) {
            if (str15ToCharArray[i] >= 92 && str15ToCharArray[i] <= 122) {
                for (int j = 97; j < 122; j++) {
                    if (str15ToCharArray[i] == j) {
                        str15ToCharArray[i] = (char) (j - 32);

                    }
                }
            } else {
                str15ToCharArray[i] = str15ToCharArray[i];
            }
        }
        return String.valueOf(str15ToCharArray);
    }
}
