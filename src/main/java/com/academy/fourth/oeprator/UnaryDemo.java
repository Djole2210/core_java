package com.academy.fourth.oeprator;

/**
 * 1. + -> Unarni plus operator ; indicira da se radi o pozitivnom broju
 * 2. - -> Unarni minus operator
 * 3. ++ -> Inkrement
 *      3.1 pre inkrement
 *      3.2 post inkrement
 * 4. (--) dekrement
 *      4.1 pre dekrement
 *      4.2 post dekrement
 *  5. (!) invertor / komplement
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        number++;//number = number + 1 (post inkrement = 24);
        System.out.println(number);
        number=23;// preinkrement = 24
        ++number;
        System.out.println(number);
        int number1 = 23;
        System.out.println(number1++);//1. posalji u konzolu (23) -> 2. nakon slanja u konzolu ovecaj za 1 = 24
        System.out.println(++number1);//1. uvecaj za 1 prethodnu vrednost (24) = 25 2. pa posalji vrednost u konzolu

        int broj = 24;
        System.out.println(broj--); // 24 u konzolu -> 23
        System.out.println(--broj); // uzmi prethodnu vrednost (23) i umanji za 1 --> 22

        boolean success = true;
        System.out.println(!success);
    }
}
