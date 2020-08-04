package day15_String;
import java.util. Scanner;
public class Practice1 {
    // write to program that ask user ask first name and last name
    // write the initial of the person

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=input.next();// Cybertek
        char ch1=firstName.charAt(0);
// String pool
        System.out.println("Enter your last name: ");
        String lastName=input.next();// school
        char ch2=lastName.charAt(0);

        System.out.println("Your initial is:"+ch1+"."+ch2);


    }
}
