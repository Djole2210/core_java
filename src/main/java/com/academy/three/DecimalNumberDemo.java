package com.academy.three;

public class DecimalNumberDemo {
    public static void main(String[] args) {
        // float 32 bitni zapis u memoriji priblizno precizan 6 do 7 decimala
        // Float nije za finansijske proracune
        float floatNumber = 3.4F;
        float floatNumber2 = 3.4F;

        double doubleNumber = 3.4;

        double a = 0.1;
        double b = 0.2;
        double c = a + b; // 0.3

        System.out.println("0.1 + 0.2 = " + c);
        System.out.println("Da li je 0.1 + 0.2 = 0.3? Odgovor = " + (c == 0.3)); // c==0.3 evaluator poredjenja
        /**
         * Zasto float i double jesu takvi kakvi jesu tj neprecizni
         * Odgovor: oni koriste binarni floating point format
         * Zato koristimo BigDecimal
         */

        double d = 0.4;
        double e = 0.4;
        double f = d + e; //0.8

        System.out.println("0.4 + 0.4 = " + f);
        System.out.println("Da li je 0.4 + 0.4 = 0.8 Odgovor = " + (f == 0.8));

    }
}
