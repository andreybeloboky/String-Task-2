package com.company;

public class StringSplit {
    /**
     * @param str11 - text for edit;
     * @param delimiter - delimiter between different index in String array;
     * @return - string array with delimiter;
     */
    public static String[] split(String str11, String delimiter) {
        char[] stringToChar = str11.toCharArray();
        char[] delimiterToChar = delimiter.toCharArray();
        int size = 0;
        for (char c : stringToChar) {
            if (c == delimiterToChar[0]) {
                size++;
            }
        }
        int begin = 0;
        String[] str2 = new String[size + 1];
        for (int i = 0; i < str2.length; i++) { //221 212 222
            for (int j = 0; j < stringToChar.length; j++) {
                if (stringToChar[j] == delimiterToChar[0]) {
                    stringToChar[j] = '0';
                    str2[i] = str11.substring(begin, j);
                    begin = j + 2;
                    break;
                } else {
                    str2[i] = str11.substring(begin, stringToChar.length);
                }
            }
        }
        return str2;
    }
}