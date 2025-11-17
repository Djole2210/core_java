package com.academy.fourth.oeprator;

public class BitDemo {
    public static void main(String[] args) {
        // Upisati broj 32 u binarnom sistemu --> 00000....11 --> 0b00011 (3)
        //  shiftovanje za jedno mesto u levo                 --> 0b01000 (8)
        //  shiftovanje za dva mesto u levo                 --> 0b01000 (16)
        int number = 4;
        number = number<<1; // shiftovanje broja 4 za jedno mesto
        System.out.println(number);
        int number2 = 4;
        number2 = number2>>1; // shiftovanje broja 4 za dva mesta
        System.out.println(number);
    }
}
