package day16_String;

import java.util.Scanner;

/*
warmup tasks:
    1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
    2. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
    3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true

 */
public class Substring_Practice {
    public static void main(String[] args) {
        //extra task:
        String str="I like to drink Pepsi";
        String drink= str.substring(16);
        System.out.println(drink); //pepsi

        String action=str.substring(10,15);
        System.out.println(action);



        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word:");
        String str1= scan.next();// "apple"

        System.out.println("Enter second word:");
        String str2= scan.next();//"banana"

        //ppleanana
       String result= str1.substring(1).concat(str2.substring(1));
       //String result=str1.substring(1)+str2.substring(1);  much easy
        System.out.println(result);
    }
}
