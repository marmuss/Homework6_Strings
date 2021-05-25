package com.tms.homework6;

/**
 * Ищет самое длинное и самое короткое слово в предложении, если таких слов несколько - выводит последнее
 */

public class ShortestAndLongestWord {
    public static void main(String[] args) {

        String string = "Большое длинное предложение и еще кусочек предложения";
        String[] words = string.split(" ");
        String longestWord = "";
        String shortestWord = "";
        int shortestLength = string.length();
        int longestLength = 0;

        for (String item : words){
            if (item.length() <= shortestLength){
                shortestWord = item;
                shortestLength = item.length();
            }
            if (item.length() >= longestLength){
                longestWord = item;
                longestLength = item.length();
            }
        }

        System.out.println("Самое короткое слово в предложении: " + shortestWord);
        System.out.println("Самое длинное слово в предложении: " + longestWord);

    }
}
