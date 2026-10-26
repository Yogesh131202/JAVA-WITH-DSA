package com.yogesh;

import java.util.Scanner;

public class flow_of_program_01 {

    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);


       // 1. Input a year and find whether it is a leap year or not.
    //    System.out.println(leapyear(2029));
        
        // 2. Take two numbers and print the sum of both.
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println(sum(a, b));

        // 3. Take a number as input and print the multiplication table for it.
        int num = sc.nextInt();
        multiplicationtable(num);

        // 4. Take 2 numbers as inputs and find their HCF and LCM.
        // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.


    }


    // 1. Input a year and find whether it is a leap year or not.
    static String leapyear(int year){
        
        int n = year;

        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0){
            return "it is a leap year";
        } else{
            return "it is a not leap year";
        }
    };

    // 2. Take two numbers and print the sum of both.
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    // 3. Take a number as input and print the multiplication table for it.
    static void multiplicationtable(int num){
        int k = 0 ;

        for(int i=1; i<=10; i++){
            k = num * i;
            System.out.println(num + " x " + i + " = " + k);
        }
    }
}
