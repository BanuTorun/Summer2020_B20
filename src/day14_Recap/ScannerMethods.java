package day14_Recap;
/*
2. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        //     double num = input.nextDouble();

        //   boolean num = input.nextBoolean();
        System.out.println("Do you want to learn Java?");
        //String num = input.next();
        String num = input.nextLine();

        System.out.println("You have entered "+num);

    }

}


