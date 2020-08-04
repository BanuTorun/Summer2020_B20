package day35_ArrayList;

public class SumOfDigit2 {
    public static void main(String[] args) {
        String str="a1b2c3";

        int sum=0;

        for(char each:str.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
                //sum+=each-48;   0~9
            }
        }
        System.out.println(sum);

        /*
        isDigit(char):verify if the char is digit, returns boolean
        isLetter(char):verifies if the char is letter, returns boolean
         */




    }
}
