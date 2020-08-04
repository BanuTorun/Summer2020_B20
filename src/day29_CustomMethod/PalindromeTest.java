package day29_CustomMethod;
/*
9. write a method that can check if a string is palindrome, print true if it's  otherwise print false
   kayak====> kayak true
   java=====> avaj  false
 */
public class PalindromeTest {

    public static void main(String[] args) {

        palindrome("Cybertek");

    }

    public static void palindrome(String word){
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }
        System.out.println(reversed.equalsIgnoreCase(word));

    }

}
