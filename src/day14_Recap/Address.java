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
public class Address {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the building number: ");
        int buildingNumber=scan.nextInt();

        scan.nextLine();
        System.out.println("Please enter the street address: ");
        String streetAddress=scan.nextLine();

        System.out.println("Please enter the city name: ");
        String cityName=scan.nextLine();

        System.out.println("Please enter state name: ");
        String stateName=scan.next();

        System.out.println("Please enter zipcode: ");
        int zipCode=scan.nextInt();

        scan.nextLine();
        System.out.println("Please enter full name of person: ");
        String fullName=scan.nextLine();

       // System.out.println("ship To: "+fullName);
       // System.out.println("         "+buildingNumber+" "+streetAddress);
       // System.out.println("         "+cityName+" ,"+stateName+""+zipCode );

        System.out.println("\nShip To: "+fullName+"\n"+buildingNumber+" "+streetAddress+"\n"+cityName+","+stateName+" "+zipCode);



    }
}
