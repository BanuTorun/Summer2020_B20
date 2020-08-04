package Office_Hours.Practice_07_13_2020;

import java.util.Scanner;

public class FrequencyOfCharBanu {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
       // System.out.println("Please enter the letter");

        String str="OOPQQ";// O2P1Q2
        String nonDup="";                    // "O2P1Q2OPQ"

        for(int i=0;i<=str.length()-1;i++){
            String ch=""+str.charAt(i);
            if(!nonDup.contains(ch)){
                nonDup+=ch;

            }

        }
        System.out.println(nonDup);

        String result="";
/*
        //nonDup=  "OPQ"          str= "OOPQQ"  ========>  O2P1Q2

        char ch1=nonDup.charAt(0); //O
        int count1=0;//1+1
        for(int i=0;i<=str.length()-1;i++){  // counting
             char each=str.charAt(i); //O O P Q Q
            if(each==ch1){
                count1=+1;
            }

        }
        result+=""+ch1+count1;

        char ch2=nonDup.charAt(1);
        int count2=0;
        for(int i=0;i<=str.length()-1;i++){
            char each=str.charAt(i);  //O O P Q Q

            if(each==ch2){
                count2+=1;
            }
        }
        result+=""+ch2+count2;

        char ch3=nonDup.charAt(2);// Q
        int count3=0;
        for(int i=0;i<=str.length()-1;i++){
            char each=str.charAt(i);
            if(each==ch3){
                count3++;
            }
        }
        result+=""+ch3+count3;
*/

        for(int j=0;j<=nonDup.length()-1;j++){
            char ch1=nonDup.charAt(0); //O
            int count1=0;//1+1
            for(int i=0;i<=str.length()-1;i++){  // counting
                char each=str.charAt(i); //O O P Q Q
                if(each==ch1){
                    count1=+1;
                }

            }
            result+=""+ch1+count1;
        }
        System.out.println(result);


    }
}
