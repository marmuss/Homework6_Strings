package com.tms.homework6;

/**
 * Находит первое слово в тексте с наименьшим количеством различных символов
 */
public class Characters {
    public static void main(String[] args) {
        String string = "ab fff 1234 jkjk ggggg";
        String[] words = string.split(" ");
        int[] counters = new int[words.length];
        char[] charArray;

        for (int i = 0; i < words.length; i++) {
            charArray = words[i].toCharArray();
            counters[i] = countMinRepetitions(charArray);
            System.out.println(charArray);
            System.out.println(counters[i]);
        }

        System.out.println("В слове " + words[returnIndexWithMinElem(counters)] + " число различных символов минимально");
    }

    public static int countMinRepetitions(char[] array) {
        int counter = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]){
                counter++;
            }
        }
        return counter;
    }

    public static int returnIndexWithMinElem(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array [i] < array[index]) {
                index = i;
            }
        }
        return index;
    }




}


