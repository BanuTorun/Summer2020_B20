package day13_Scanner;
import java.util.Scanner;
public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//Enter1
        System.out.println("Enter your building number: ");
        int buildingNumber=scan.nextInt();//7925

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName= scan.nextLine();//Enter1

        System.out.println(buildingNumber+" "+streetName);

        scan.close();
    }
}
