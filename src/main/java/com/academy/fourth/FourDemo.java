package com.academy.fourth;

public class FourDemo {
    public static void main(String[] args) {
        //TIP_PODATKA varijabla = VREDNOST;
        int firstNumber = 23; //decimalni zapis vrednosti
        System.out.println(firstNumber);
        int secondNumber = 0x1a; //HEKSADECIMALNI zapis vrednosti
        System.out.println(secondNumber);
        // 26 binarno -> 16=2^4 8=2^3 2=2^1  11010
        int thirdNUmber = 0b11010; // BINARNI brojni sistem
        System.out.println(thirdNUmber);

        long crediCardNumber = 1234_5678_9191L;
        long hexNumber = 0xFF_EC;

    }
}
