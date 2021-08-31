package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter space between string");
        String indent = scanner.nextLine();
        String str1 = new String("1");
        String str2 = new String("2");
        String str3 = new String("3");
        String str4 = StringJoin.join(indent, str1, str2, str3);
        System.out.println(str4);
        System.out.println("Enter first word");
        String oneWord = scanner.nextLine();
        System.out.println("Enter second word");
        String twoWord = scanner.nextLine();
        System.out.println("Enter three word");
        String threeWord = scanner.nextLine();
        String str5 = new String("Hi %s. How old are you? %s. Would you like a drink? %s");
        String str6 = StringFormat.format(str5, oneWord, twoWord, threeWord);
        System.out.println(str6);
    }
}
