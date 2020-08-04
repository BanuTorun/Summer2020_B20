package day16_String;

import java.util.Scanner;

/*
ask the user if he/she
is employeed if the user says yes, print "employeed  (YES,yEs,yes.....)
otherwise====> unmployeed
 */
public class Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Are you employeed?:");
        String answer=scan.next();
       // String answer=scan.next().toLowerCase(); you can use

        if (answer.equalsIgnoreCase("yes")){// equalsIgnoreCase is prefered
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }
    }


}
