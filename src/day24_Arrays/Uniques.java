package day24_Arrays;
/*
1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
2. write a program that asks user how many numbers he wants to enter,
and get all the user inputs and store them into an array variable,
and then write the program that can return maximum and minimum numbers

3. Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
 */
public class Uniques {
    public static void main(String[] args) {
        String str="aabcc";

        String uniques=""; //"b"

        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);          // a a b c c
            int first=str.indexOf(ch);     //  0 0 2 3 3
            int last=str.lastIndexOf(ch); //   1 1 2 4 4

            if(first==last){
                uniques+=ch;
            }
        }
        System.out.println(uniques);



    }
}
