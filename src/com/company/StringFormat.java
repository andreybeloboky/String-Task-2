package com.company;

public class StringFormat {
    /**
     * @param str5 - text for edit;
     * @param word - word, which need enter in "%s";
     * @return - return string with replace "%s" onto user word;
     */
    public static String format(String str5, String... word) {
        char[] arrayChar = str5.toCharArray();
        String string = new String();
        String charToString = String.valueOf(arrayChar);
        int z = 0;
        for (String s : word) {
            for (int j = 0; j < arrayChar.length; j++) {
                if (arrayChar[j] == '%' && arrayChar[j + 1] == 's') {
                    arrayChar[j] = '0';
                    arrayChar[j + 1] = '0';
                    string += charToString.substring(z, j) + s;
                    z = j + 2;
                    break;
                }
            }
        }
        return string;
    }
}

