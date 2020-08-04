package day16_String;
/*
write a program that can check if the two strings ara equal or not.
 */
import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word:");
        String first=scan.next();

        System.out.println("Enter second word:");
        String second=scan.next();
        /*
        if(first.equals(second)){
            System.out.println("They are equasl");
        }else{
            System.out.println("They are not equal");
        }

         */
        String result=first.equals(second)?"Equal":"Not equal";
      //  String result=first.equalsIgnoreCase(second)?"Equal":"Not equal";
        System.out.println(result);

    }
}
