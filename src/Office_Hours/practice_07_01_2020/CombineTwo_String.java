package Office_Hours.practice_07_01_2020;

import java.util.Scanner;

/*
sk user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
public class CombineTwo_String {
    public static void main(String[] args) {
        String str1="one";
        //           012
        String str2="eight"; //ight

        //FIRST
        /*
        char ch1=str1.charAt(str1.length()-1);// last char from str1
        char ch2=str2.charAt(0);// first char from str2

        if(ch1==ch2){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }
*/
        //SECOND
        String s1=str1.substring(str1.length()-1);//"e"
                    //substring(2,3)===>e
        String s2=str2.substring(0,1); //   "e"

        if(s1.equals(s2)){
            System.out.println(str1 + str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }

        // THIRD

        String t1=""+str1.charAt(str1.length()-1);// last char from str1
        String t2=""+str2.charAt(0);// first char from str2

        if(t1.equals(t2)){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }

    }

}
