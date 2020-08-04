package day21_loops;

import java.util.Scanner;

/*
1. write a program that asks user to enter 5 numbers and retuns the maximum number

 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int max= -46546657; //30

        for(int i=10;i<=50;i+=10){

            System.out.println("Enter a number: ");
            int num=scan.nextInt(); //20,5,10,30,5

            if(num>max){
                max=num;
            }

        }
        System.out.println("max number: "+max);


    }
}
