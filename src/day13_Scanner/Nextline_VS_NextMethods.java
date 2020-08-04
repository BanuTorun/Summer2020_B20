package day13_Scanner;

import java.util.Scanner;
public class Nextline_VS_NextMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//Enter
        System.out.println("Enter your salary");
        double salary=scan.nextDouble();//120000

        scan.nextLine();//use use this to take out the Enters tht are left in the scanner.
        // so that we can use the next netxline method


        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();// Enter

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+fullName);
    }
}
