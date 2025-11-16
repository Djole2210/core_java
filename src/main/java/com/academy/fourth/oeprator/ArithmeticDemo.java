package com.academy.fourth.oeprator;

import java.util.Scanner;

/**
 * Aritmeticki operatori:
 * 1. + Additive operator
 * 2. - Substraction operator
 * 3. * Multiplication
 * 4. / Division operator
 * 5. % Reminder -> nije deljenje nego ostatak od deljenja
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Dobro dosli u nas sitem...");
        System.out.println("Unesite prvi broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj:");
        int number2 = new Scanner(System.in).nextInt();

        int suma = number1 + number2;
        System.out.println("Suma = " + suma);
        int razlika = number1 - number2;
        System.out.println("Razlika = " + razlika);
        int multiplication = number1 * number2;
        System.out.println("Proizvod = " + multiplication);
        int division = number1 / number2;
        System.out.println("Rezultat deljenja = " + division);
        int reminder = number1 % number2;
        System.out.println("Ostatak od deljenja = " + reminder);
    }
}
