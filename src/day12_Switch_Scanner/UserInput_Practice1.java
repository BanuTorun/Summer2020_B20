package day12_Switch_Scanner;

import java.util.Scanner;
/*
Task:
    1. write a program that can ask user to enter a number
            if the number is odd number print: "odd number"
            otherwise, print: "Even"
 */
public class UserInput_Practice1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number ");
            double num = scan.nextDouble();

            String result=(num %2==0)? num+" is even number": num+" is odd number";
             System.out.println(result);

    }

}
