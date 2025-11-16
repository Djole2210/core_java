package com.academy.fourth;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("Zdravo! Upisi omiljeni broj");
        int omiljeniBroj = new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj==23; //true ili false
        if (condition) {
            System.out.println("Zadovoljio si..");
        }else {
            System.out.println("Nisi zadovoljio");
        }
    }
}
