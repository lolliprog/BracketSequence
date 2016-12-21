package com.alexandrova;

import java.util.Scanner;


public class Brackets {
    void checkEquals() {
        System.out.println("Enter brackets:");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        i.toCharArray();
        int numberZ = 0;
        int numberO = 0;
        for (int j = 0; j < i.length(); j++) {
            if (i.charAt(j) == ')') {
                numberZ++;
            } else if (i.charAt(j) == '(') {
                numberO++;
            }
        }
        if (numberZ != numberO) {
            System.out.println("Wrong bracket sequence:");
            System.out.println("quantity of ( : " +numberO );
            System.out.println("quantity of ) : " +numberZ );
        } else {
            System.out.println("Right bracket sequence");
        }
    }
}
