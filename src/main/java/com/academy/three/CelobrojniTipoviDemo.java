package com.academy.three;

public class CelobrojniTipoviDemo {
    public static void main(String[] args) {
        byte firstNumber = 127;
        System.out.println("Deklarisao si varijablu = " + firstNumber);
        short secondNumber = 32767;
        System.out.println("Short number: " + secondNumber);
        // CPU konzumirajuce  Memorijski konzumirajuce
        // DEFAULT ili celobrojni tip
        int thirdNumber = 127; //32 bitni CPU najbolji za memorijski prostor
        System.out.println("Integer= = " + thirdNumber);
        long longNumber = thirdNumber; //automatska konverzija tipa podatka
        int intNumber = (int) longNumber; //eksplicitna konverzija
        System.out.println(intNumber);

        //TIP varijable = VREDNOST
        long longNumber2 = 34; // 1. evaluira se 34 ali kao 2. automatska konverzija tipa u long 64 3. dodeli se vrednost
        long longNumber3 = 34L; // evaluira se kao 64 bitni long 2, dodeli se vrednost


    }
}
