package day22_NestedLoop;

import java.util.Scanner;

/*
2. Write a program that can asks user to enter
 one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

 */
public class OccurenciesOfChar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        //String str="aaaaaaannnnnbbbbaaabbbb";
       // char ch='a'; //1+1=2 frequency of ch in str

        String str=scan.next();
        char ch=scan.next().charAt(0);

        int count=0;

        for(int i=0; i<=str.length()-1; i++){

            char each=str.charAt(i);// a b a b c

            if(each==ch){    // if it is true, means ch is occured in str
                count+=1;

            }

        }

   /*
        int index=0;
        while(index<=str.length()-1){
            char each=str.charAt(index);// a b a b c

            if(each==ch){    // if it is true, means ch is occured in str
                count+=1;

            }

        }
*/
        System.out.println(count);

    }
}
