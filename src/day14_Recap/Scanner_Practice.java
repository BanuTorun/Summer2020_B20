package day14_Recap;

/* task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
*/
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender: ");
        String gender=scan.next();

        System.out.println("Please enter your age");
        int age=scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter your country name:");
        String countryName=scan.nextLine();

        System.out.println("Please enter your zipcode: ");
        int zipCode=scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter your full name: ");
        String fullName=scan.nextLine();

        System.out.println("Please enter full company name:");
        String fullCompanyName=scan.nextLine();




    }
}
