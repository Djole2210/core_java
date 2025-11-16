package com.academy.fourth.oeprator;

import java.util.Scanner;

/**
 * Operatori poredjenja:
 * 1. == equal to
 * 2. != not equal
 * > greater than
 * < less than
 * 5. >=
 * 6. <=
 */
public class ComparasionDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj:");
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == number2){
            System.out.println("Brojevi su jednaki");
        }
        if (number1 != number2) {
            System.out.println("Brojevi su razliciti");
        }
        if (number1 > number2){
            System.out.println("Prvi broj je veci od drugog");
        }
        if (number1 >= number2){
            System.out.println("Prvi broj je veci ili bar jednak drugom");
        }
        if (number1 < number2){
            System.out.println("Prvi broj je manji od drugog");
        }
        if (number1 <= number2){
            System.out.println("Prvi broj je manji ili bar jednak drugom");
        }
    }
}
