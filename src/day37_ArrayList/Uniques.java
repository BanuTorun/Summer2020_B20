package day37_ArrayList;
/*
1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D

 */
import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str="AABBCDDAAEF";
        String unique="";

       // ArrayList<Character>list=new ArrayList<>();


       // for(char each: str.toCharArray()){
        //    list.add(each);

        ArrayList<String>list=new ArrayList<>();

        for(String each: str.split("") ){ // with split String return to array
            list.add(each);
        }
        System.out.println(list);


        for(String each :list){

            int count= Collections.frequency(list,each);
            if(count==1){
                unique+=each;

            }
        }

        System.out.print(unique);




    }
}
