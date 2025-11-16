package com.academy.three;

public class CharDemo {
    public static void main(String[] args) {
        char charVar = 'K'; //samo jedan karakter se upisuje, za vise se koristi string
        System.out.println(charVar);
        char charVar2 = '?';
        System.out.println(charVar2);
        //Step1: 65 je int 32 bit
        //Step2: 65 to char - automatic conversion (ASCII tablice)
        //Step3: A ubaci u charVar3
        char charVar3 = 65;
        System.out.println(charVar3);

        //Step1: charVar3 'A'
        //Step2: 'A' u int --> automatic 65
        //Step3: 65
        int number = charVar3;
        System.out.println(number);




    }
}
