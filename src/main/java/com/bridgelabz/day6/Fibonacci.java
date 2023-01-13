package com.bridgelabz.day6;

import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(int N) {
        int num1=0, num2=1;
        for (int i=0; i<N; i++) {
            System.out.print(num1 + " ");
            int num3=num1+num2;
            //swap
            num1=num2;
            num2=num3;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = scanner.nextInt();
        fibonacci(N);
    }

}
