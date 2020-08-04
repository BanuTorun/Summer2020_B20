package day15_String;

import java.util.Scanner;
/*
2. write a program to ask user to enter first naame and last name
			then print the full name in all upper case
 */
public class Practice4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name: ");
      //  String firstName=input.next().toUpperCase();
        String firstName=input.next();//cybertek

        System.out.println("Enter your last name: ");
       // String lastName=input.next().toUpperCase();
        String lastName=input.next();//school

        String fullName=firstName+" "+lastName;
        //System.out.println(fullName); banu yildirim

        fullName=fullName.toUpperCase();

        System.out.println(fullName);

    }
}
