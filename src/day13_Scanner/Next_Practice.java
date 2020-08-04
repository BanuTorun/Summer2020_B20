package day13_Scanner;
import java.util.Scanner;
public class Next_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);// Cybertek School

        System.out.println("Enter your first name: ");
        String firstName=scan.next();// Cybertek


        System.out.println("Enter your last name: ");
        String lastName=scan.next();

        String fullName=firstName+" "+lastName;
        System.out.println("Fullname is: "+fullName);

    }
}
