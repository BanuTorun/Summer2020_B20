package day32_MethodOverloading;

import java.util.Scanner;

/*
1. write a method that can return the full name of a person in regular format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

 */
public class FullName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter  name");
        String first=scan.nextLine();
        System.out.println("please enter last name");
        String last=scan.nextLine();
/*

        first=first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String fullName=first+" "+last;

        System.out.println(fullName);
       */
           String fullName=formatFullName(first,last);
        System.out.println(fullName);

    }
    public static String formatFullName(String first,String last){
        first=first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=first+" "+last;

        return fullName;
    }

}
