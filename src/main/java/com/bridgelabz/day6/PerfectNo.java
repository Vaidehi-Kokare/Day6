package com.bridgelabz.day6;

import java.util.Scanner;

public class PerfectNo {
    static void perfectNo(int num) {
        int sum=0,temp=num;
        for (int i=1;i<temp;i++) {
            if (temp%i==0){
                sum += i;
            }
        }
        if(sum==num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        perfectNo(num);
    }

}
