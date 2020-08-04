package day20_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {

        int num=10; //11....15

        while(num<15){
            System.out.println("Banu"); // 1 2 3 4 5
            num++;
        }
        System.out.println(num);// 15

        System.out.println("===================================");

        String str="Cybertek School";
        //          01234567
        String reversed="";

        int index=str.length()-1;
        while(index>=0){
            reversed+=str.charAt(index);
            index--;
        }
        System.out.println(reversed);
    }
}
