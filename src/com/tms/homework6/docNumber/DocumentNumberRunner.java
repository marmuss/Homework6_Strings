package com.tms.homework6.docNumber;

public class DocumentNumberRunner {
    public static void main(String[] args) {

        String documentNumber = "5754-Dfr-6785-AbC-1a2B";

        CheckingTheDocNumber.outputFirstFourBlocks(documentNumber);

        CheckingTheDocNumber.replaceBlocks(documentNumber);

        CheckingTheDocNumber.printLettersLowerCase(documentNumber);

        CheckingTheDocNumber.printLettersUpperCase(documentNumber);

        CheckingTheDocNumber.checkABC(documentNumber);

        CheckingTheDocNumber.check555(documentNumber);

        CheckingTheDocNumber.check1a2b(documentNumber);







    }
}
