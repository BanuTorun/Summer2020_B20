package day19_ForLoop;

import java.util.Scanner;

/*
2. palindrome
level ==> level ==> true
mom ==> mom  ==> true
muhtar ==> rathum ==> false

 */
public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();      //  exp; level mom anna civic

        String reverseStr="";

        for(int i= str.length()-1; i>=0; i-- ){
            str.charAt(i);
            reverseStr+=str.charAt(i);  //reverseStr=reverseStr+str.charAt(i);
            // reverseStr+=str.substring(i, i+1);

        }
        System.out.println(reverseStr);
        System.out.println(str.equals(reverseStr));
    }
}
