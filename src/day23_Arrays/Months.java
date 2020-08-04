package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {


        String[] months={"Jan","Feb","Mar","Apr","Jun","Jul","Agu","Sep","Oct","Nov","Dec"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number between1~12");
        int n=scan.nextInt(); // 5

        System.out.println(months[n-1]);
    }
}
