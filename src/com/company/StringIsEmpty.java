package com.company;

public class StringIsEmpty {
    /**
     * @param str - text for edit;
     * @return if string have 0 elements enter true and vice versa;
     */
    public static boolean isEmpty(String str){
        boolean str2;
        if (str.length() == 0) {
            str2 = true;
        } else {
            str2 = false;
        }
        return str2;
    }
}

