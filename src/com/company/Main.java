package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indent = scanner.nextLine();
        String str1 = new String("1");
        String str2 = new String("2");
        String str3 = new String("3");
        String str4 = StringJoin.join(indent, str1, str2, str3);
        System.out.println(str4);
    }
}
