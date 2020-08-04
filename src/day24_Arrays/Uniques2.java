package day24_Arrays;
/*
1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
 */
import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.next();
        // "aabcc"

        String unique = ""; // "b

        for(int j = 0; j <= str.length()-1; j++){          // because we need the frequency of every single character
            char ch = str.charAt(j);                       // a a b c c
            int count = 0;                                 // frequency of ch

            for(int i = 0; i <= str.length()-1; i++){       // used for finding the frequency of ch and assign it to count
                char each = str.charAt(i);                  // a  a  b  c  c
                if(ch == each){
                    count++;
                }
            }

            if(count == 1 ){                                // if it only occured one time
                unique += ch;
            }

        }

        System.out.println(unique);


    }

}
