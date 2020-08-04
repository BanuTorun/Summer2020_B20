package day21_loops;
/*
3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
                10/3=3
                10-3=7
                7-3=4;
                4-3=1

 */
public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=20; //2
        int b=0;

        if(b==0){
            System.out.println("invalid input");
            System.exit(0);// forcefully teminating the program
        }

        int count=0; //3

        while(a>b){
            a-=b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);




    }
}
