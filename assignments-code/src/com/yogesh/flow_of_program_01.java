package com.yogesh;


public class flow_of_program_01 {

    public static void main(String[] args) {


       // 1. Input a year and find whether it is a leap year or not.
       System.out.println(leapyear(2029));
        
        // 2. Take two numbers and print the sum of both.
        // 3. Take a number as input and print the multiplication table for it.
        // 4. Take 2 numbers as inputs and find their HCF and LCM.
        // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.


        System.out.println("Java is working in VS Code!");

        int a = 10;
        int b = 20;

        System.out.println("Sum = " + (a + b));
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
}
