package com.kodnest.loopspackage;
import java.util.Scanner;
public class SumofDigitsUntilbecome1digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        int rem = 0;
        int sum = 0;

        while (a > 0 || sum >= 10) {
            if (a == 0) {
                a = sum;
                sum = 0;
            }
            
            rem = a % 10;
            sum = sum + rem;

            a = a / 10;
        }

        System.out.println("Sum = " + sum);
    }
}
