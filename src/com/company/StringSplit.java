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
        int size = sizeArray(stringToChar, delimiterToChar);
        int begin = 0;
        int j = 0;
        String[] str2 = new String[size + 1];
        for (int i = 0; i < str2.length - 1; i++) {
            do {
                if (stringToChar[j] == delimiterToChar[0]) {
                    stringToChar[j] = '0';
                    str2[i] = str.substring(begin, j);
                    begin = j + 2;
                }
                j++;
            }while (stringToChar[j - 1] != '0');
        }
        str2[str2.length - 1] = str.substring(begin, stringToChar.length);
        return str2;
    }

    /**
     * @param stringToChar    - translate string str11 to array char;
     * @param delimiterToChar - translate string delimiter to array char delimiterToChar;
     * @return - size array string;
     */
    public static int sizeArray(char[] stringToChar, char[] delimiterToChar) {
        int size = 0;
        for (char c : stringToChar) {
            if (c == delimiterToChar[0]) {
                size++;
            }
        }
        return size;
    }
}