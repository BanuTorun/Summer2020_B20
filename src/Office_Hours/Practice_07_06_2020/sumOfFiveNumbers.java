package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

/*
2. write a program that can ask the user enter a number for five times and the returns the sum of those five numbers

 */
public class sumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sum=0; //10+20+30+40+50
        for(int i=1;i<=1000; i++){
            System.out.println("Enter a number: ");
            int num=scan.nextInt(); //10 ,20,30,40,50
            sum+=num;
        }
        System.out.print(sum);




    }
}

