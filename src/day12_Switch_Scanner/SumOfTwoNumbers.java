package day12_Switch_Scanner;

import java.util.Scanner;

/*
 2. write a program that can ask youser to enter two number, and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number
            20
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = scan.nextInt();
        System.out.println("Enter your second number: ");
        int b = scan.nextInt();

        int sum=a+b;
        System.out.println( sum +"is the total of two numbers");
       // or  System.out.println("sum of to those numbers are:" (a+b));






    }
}
