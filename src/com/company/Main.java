/*
 * Cycle practice
 *
 * Version 1.0
 *
 * Copyright Kopach Daria KNTEU
 */

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        //1. Write to console 8 facts about yourself using primitive types.

        byte age = 22;
        short height = 173;
        float weight = 55.5f;
        double experience = 2.5;
        int wishedSalary = 203030;
        long dreamSalary = 10_303_000_00;
        char drivelicesce = 'A';
        boolean isstudent = true;

        String aboutMyself = "My name is Daria. I am " + age + " years old."
                + "My height is " + height + "; weight - " + weight + " kg.\n"
                + "I am a student in KNTEU, it's " + isstudent + ". My "
                + "experience is " + experience + " years.                 "
                + "\n" + "I want salary appr " + wishedSalary + " UAH,"
                + "but much " + "better if " + dreamSalary + " UAH.\n"
                + "I have a driver's license " + drivelicesce + " type.     ";

        System.out.println(aboutMyself);
        System.out.println("The length of this story is "
                + aboutMyself.length() + " symbols." + "\n");


        // 2. Check a string as a palindrome

        String word = "!(Мед я, : как яд, ; ем)?";
        // also checked the following palindromes:
        /*"Ах, Ира – во повариха!"
        "Нет ума, дядя? Да, мутен"
        "Я не стар, брат Сеня"
        "Коту скоро сорок суток" */

        String words = word
                .replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll("!", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("\\?", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\\!", "")
                .replaceAll("\"", "")
                .replaceAll("-", "")
                .toLowerCase()
                ;

        String template = "";

        for (int i = 0; i < words.length(); i++) {
            int index = words.length() - i - 1;
            template += words.charAt(index);
        }

        System.out.println("The result is " + template);

        if (words.equals(template)) {
            System.out.println("This sentence is palindrome " + "\n");
        } else {
            System.out.println("This sentence is not palindrome" + "\n");
        }

        /*
        3.Get the area limited by the following functions x = 0 .. 3.14;
        y = sin(x); y = 0.1 * k, where k is the last number of birthday date;
         */

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.9;
        double area = 0;

        for (double x = 0; x < finish; x+=deltaX) {
            double rectangle = 0;
            if (Math.sin(x) <= y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            area += rectangle;
        }

        System.out.println("The area is " + area);

    }

}



