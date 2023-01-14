package com.bridgelabz.day6;

import java.util.Scanner;

public class ReverseNumber {
    static void reverseNumber(int num) {
        int reverseNumber = 0,lastDigit =0;
        int temp = num;
        while (temp!=0) {
            lastDigit = temp %10;
            reverseNumber = reverseNumber*10 + lastDigit;
            temp = temp /10;
        }
        System.out.println(num + " reversed is " + reverseNumber);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        reverseNumber(num);
    }
}
