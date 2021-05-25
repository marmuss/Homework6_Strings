package com.tms.homework6;

import java.util.Scanner;
import java.lang.StringBuilder;

/**
 * Проверяетб является ли выбранное слово палиндромом
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введите текст");

        Scanner inputString = new Scanner(System.in);
        String string = inputString.nextLine();
        System.out.println(string);


        System.out.println("Введите номер слова, который вы хотите проверить");

        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();


        String[] words = string.split(" ");

        if (number <= words.length){

            StringBuilder word = new StringBuilder(words[number-1]);


            if (words[number-1].equals(word.reverse().toString())){
                System.out.println("Слово " + words[number-1] + " палиндром");
            } else {
                System.out.println("Слово " + words[number-1] + " не палиндром");
            }

        } else {
            System.out.println("Слова с таким номером в тексте нет");
        }

        inputString.close();
        inputNumber.close();
    }
}
