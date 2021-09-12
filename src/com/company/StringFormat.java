package com.company;

public class StringFormat {
    /**
     * @param str  - text for edit;
     * @param word - word, which need enter in "%s";
     * @return - return string with replace "%s" onto user word;
     */
    public static String format(String str, String... word) {
        char[] arrayChar = str.toCharArray();
        String string = new String();
        String charToString = String.valueOf(arrayChar);
        int z = 0;
        int j = 0;
        for (String s : word) {
            do {
                if (arrayChar[j] == '%' && arrayChar[j + 1] == 's') {
                    arrayChar[j] = '0';
                    arrayChar[j + 1] = '0';
                    string += charToString.substring(z, j) + s;
                    z = j + 2;
                }
                j++;
            } while (arrayChar[j] != '0' && arrayChar[j + 1] != '0');
        }
        return string;
    }
}

