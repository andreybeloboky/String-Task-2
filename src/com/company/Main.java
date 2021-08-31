package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // join method
        System.out.println("Enter space between string");
        String indent = scanner.nextLine();
        String str1 = new String("Hi");
        String str2 = new String("How are you?");
        String str3 = new String("Where are you from?");
        String str4 = StringJoin.join(indent, str1, str2, str3);
        System.out.println(str4);

        // format method
        System.out.println("Enter first word");
        String oneWord = scanner.nextLine();
        System.out.println("Enter second word");
        String twoWord = scanner.nextLine();
        System.out.println("Enter three word");
        String threeWord = scanner.nextLine();
        String str5 = new String("Hi %s. How old are you? %s. Would you like a drink? %s");
        String str6 = StringFormat.format(str5, oneWord, twoWord, threeWord);
        System.out.println(str6);

        // isEmpty method
        System.out.println("Enter string (method isEmpty)");
        String str7 = scanner.nextLine();
        boolean str8 = StringIsEmpty.isEmpty(str7);
        System.out.println(str8);
    }
}
