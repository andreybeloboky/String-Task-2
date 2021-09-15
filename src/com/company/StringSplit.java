package com.company;

public class StringSplit {
    /**
     * @param str       - text for edit;
     * @param delimiter - delimiter between different index in String array;
     * @return - string array with delimiter;
     */
    public static String[] split(String str, String delimiter) {
        char[] stringToChar = str.toCharArray();
        char[] delimiterToChar = delimiter.toCharArray();
        int size = calculateArraySize(stringToChar, delimiterToChar);
        int begin = 0;
        int end = 0;
        String[] result = new String[size + 1];
        for (int i = 0; i < result.length - 1; i++) {
            do {
                if (stringToChar[end] == delimiterToChar[0]) {
                    stringToChar[end] = '0';
                    result[i] = str.substring(begin, end);
                    begin = end + 2;
                }
                end++;
            }while (stringToChar[end - 1] != '0');
        }
        result[result.length - 1] = str.substring(begin, stringToChar.length);
        return result;
    }

    /**
     * @param stringToChar    - translate string str11 to array char;
     * @param delimiterToChar - translate string delimiter to array char delimiterToChar;
     * @return - size array string;
     */
    public static int calculateArraySize(char[] stringToChar, char[] delimiterToChar) {
        int size = 0;
        for (char c : stringToChar) {
            if (c == delimiterToChar[0]) {
                size++;
            }
        }
        return size;
    }
}