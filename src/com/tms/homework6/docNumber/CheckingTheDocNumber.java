package com.tms.homework6.docNumber;

/**
 * Класс содержит методы для работы с номером документа
 * outputFirstFourBlocks - выводит певые четыре блока с цифрами
 * replaceBlocks - заменяет буквы в первых двух блоках на *
 * printLettersUpperCase - выводит номер документа в вверхнем регистре в формате Letters:yyy/yyy/y/y
 * printLettersLowerCase - выводит номер документа в нижнем регистре в формате Letters:yyy/yyy/y/y
 * checkABC - проверяет, есть ли в номере документа последовательность ABC
 * check555 - проверяет, начинается ли номер документа с 555
 * check1a2b - проверяет, заканчивается ли номер документа на 1a2b
 *
 */
public class CheckingTheDocNumber {

    public static void outputFirstFourBlocks(String documentNumber){
        String[] splitNumber = documentNumber.split("-");
        System.out.println(splitNumber[0] + " " + splitNumber[2]);
    }

    public static void replaceBlocks(String documentNumber){
        String[] splitNumber = documentNumber.split("-");
        for(int i = 0; i < splitNumber.length; i++){
            if (splitNumber[i].length() == 3){
                System.out.print(splitNumber[i].replaceAll("[a-zA-Z]", "*"));
            } else {
                System.out.print(splitNumber[i]);
            }
            if (i != splitNumber.length-1){
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void printLettersUpperCase(String documentNumber){
        StringBuilder string = new StringBuilder(documentNumber.toUpperCase());
        string.replace(0, 5, "Letters:");
        string.replace(11, 17, "/");
        string.replace(15, 17, "/");
        string.replace(17, 18, "/");
        System.out.println(string);
    }

    public static void printLettersLowerCase(String documentNumber){
        String newDocNumber = "Letters:" + documentNumber.substring(5, 8) + "/" + documentNumber.substring(14, 17) + "/"
                + documentNumber.substring(19, 20) + "/" + documentNumber.substring(21);
        System.out.println(newDocNumber.toLowerCase());

    }

    public static void checkABC(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность ABC");
        } else {
            System.out.println("Номер документа не содержит последовательность ABC");
        }
    }

    public static void check555(String documentNumber){
        if (documentNumber.indexOf("555") == 0){
            System.out.println("Номер документа начинается с 555");
        } else {
            System.out.println("Номер документа не начинается  с 555");
        }
    }

    public static void check1a2b(String documentNumber){
        if (documentNumber.toLowerCase().indexOf("1a2b") == documentNumber.length() - 4){
            System.out.println("Номер документа заканчивается на 1a2b");
        } else {
            System.out.println("Номер документа не заканчивается на 1a2b");
        }
    }



}
