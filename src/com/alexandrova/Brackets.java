package com.alexandrova;

import java.util.Scanner;


public class Brackets {


    void checkEquals() {
        System.out.println("Enter brackets:");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        i.toCharArray();
        int bracketsCounter = 0;
        if (!hasBracket(i)) {
            System.out.println("There is no brackets!");
        } else {
            if (i.length() > 1) {
                if (!isValidFirstElement(i) || !isValidLastElement(i)) {
                    printWrong();
                } else {
                    for (int j = 0; j < i.length(); j++) {
                        if (i.charAt(j) == '(') {
                            bracketsCounter++;
                        } else if (i.charAt(j) == ')') {
                            bracketsCounter--;
                        }
                    }
                    if (bracketsCounter != 0) {
                        printWrong();
                    } else {
                        System.out.println("Right bracket sequence");
                    }
                }
            } else {
                printWrong();
            }
        }
    }

    boolean hasBracket(String line) {
        boolean hasBracket = false;
        for (int j = 0; j < line.length(); j++) {
            if (line.charAt(j) == ')' || line.charAt(j) == '(') {
                hasBracket = true;
            }
        }
        return hasBracket;
    }

    boolean isValidFirstElement(String line) {
        int indexOfFirst = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ')' || line.charAt(i) == '(') {
                indexOfFirst = i;
                break;
            }
        }
        if (line.charAt(indexOfFirst) == ')') {
            return false;
        } else {
            return true;
        }
    }

    boolean isValidLastElement(String line) {
        int indexOfLast = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ')' || line.charAt(i) == '(') {
                indexOfLast = i;
            }
        }
        if (line.charAt(indexOfLast) == '(') {
            return false;
        } else {
            return true;
        }
    }
    void printWrong(){
        System.out.println("Wrong bracket sequence!");
    }
}
