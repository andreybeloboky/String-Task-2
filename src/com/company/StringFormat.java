package com.company;

public class StringFormat {
    /**
     * @param str   - text for edit;
     * @param words - word, which need enter in "%s";
     * @return - return string with replace "%s" onto user word;
     */
    public static String format(String str, String... words) {
        char[] arrayChar = str.toCharArray();
        String string = new String();
        int startFragmentIndex = 0;
        int endFragmentIndex = 0;
        for (String word : words) {
            do {
                if (arrayChar[endFragmentIndex] == '%' && arrayChar[endFragmentIndex + 1] == 's') {
                    string += substring(arrayChar, endFragmentIndex, startFragmentIndex, string, str) + word;
                    startFragmentIndex = endFragmentIndex + 2;
                }
                endFragmentIndex++;
            } while (arrayChar[endFragmentIndex] != '0' && arrayChar[endFragmentIndex + 1] != '0');
        }
        return string;
    }

    /**
     * @param arrayChar        - edit string to char;
     * @param endFragmentIndex - end index in char array before the symbal %s;
     */
    public static void replaceChar(char[] arrayChar, int endFragmentIndex) {
        arrayChar[endFragmentIndex] = '0';
        arrayChar[endFragmentIndex + 1] = '0';
    }

    /**
     * @param arrayChar          - edit string to char;
     * @param endFragmentIndex   - end index in char array before the symbal %s;
     * @param startFragmentIndex - from begin array to endFragmentIndex
     * @param string             - new string for result recording;
     * @param str                - text for edit;
     * @return - return string with replace "%s" onto user word;
     */
    public static String substring(char[] arrayChar, int endFragmentIndex, int startFragmentIndex, String string, String str) {
        replaceChar(arrayChar, endFragmentIndex);
        string = str.substring(startFragmentIndex, endFragmentIndex);
        return string;
    }
}
