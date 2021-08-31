package com.company;

public class StringIsEmpty {
    /**
     * @param str - text for edit;
     * @return if string have 0 elements enter true and vice versa;
     */
    public static boolean isEmpty(String str){
        boolean str2;
        if (str.length()-1 == 0) {
            str2 = false;
        } else {
            str2 = true;
        }
        return str2;
    }
}

