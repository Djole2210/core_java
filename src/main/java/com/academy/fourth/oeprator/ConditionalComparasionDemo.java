package com.academy.fourth.oeprator;
import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.Scanner;
/**
 *
 * && -> AND
 *
 * || -> OR
 */
public class ConditionalComparasionDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj 1");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj 2");
        int number2 = new Scanner(System.in).nextInt();
        if ((number1==23) && (number2<10)){
            System.out.println("Michael Jordan i neki fudbaler");
        }
        if ((number1 == 23) || (number2 < 10)){
            System.out.println("Ili je Michael Jordan ili je neki fudbaler");
        }
        System.out.println("Number2 = " + number2);
        if ((number1 == 23) && (number2++ < 10)){
            System.out.println("Michael Jordan i neki fudbaler");
        }
        System.out.println("Number2 = " + number2);
        if ((number1 == 23) || (number2 < 10)){
            System.out.println("Ili je Michael Jordan ili je neki fudbaler");
        }

    }
}
