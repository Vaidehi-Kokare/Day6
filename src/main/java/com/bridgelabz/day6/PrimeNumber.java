package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {
    static void primeNumbers(int Num) {
        int flag = 0;
        for (int i = 2; i<=Num; i++){
            if (Num%i!=0)
                flag=1;

        }
        if(flag==0)
            System.out.println(Num + " is a not prime number");
        else
            System.out.println(Num + " is a prime number");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int Num = scanner.nextInt();
        primeNumbers(Num);
    }
}
