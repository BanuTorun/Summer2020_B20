package day14_Recap;

import java.util.Scanner;
public class NextLine_VS_ScannerMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter age: ");
        int age=scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter your full name: ");
        String fullName=scan.nextLine();

        System.out.println(fullName+" is "+age+" years old.");

    }
}
