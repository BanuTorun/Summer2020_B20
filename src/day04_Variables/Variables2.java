package day04_Variables;

public class Variables2 {
    public static void main(String[] args) {
        char ch1='A';
        char ch2=65;
        System.out.println(ch1);
        System.out.println(ch2);

        char ch3=35000;
        System.out.println(ch3);

       // char ch4=66000; error because out of range
        char ch5=45876;
        System.out.println(ch5);

        char c1='A'; //65
        char c2='B'; //66

        System.out.println(c1+c2);

        int result=c1+c2; //131
        System.out.println(c1+c2);

        double d=c1+c2;
        System.out.println(d);

        int num1='A';
        System.out.println(num1); //65

        char c4=65+45;
        System.out.println(c4); //n

        char c5='z';
        char c6=897;
        System.out.println(c6);

        char c7='1';               //49
        System.out.println(c7+1); //50
        //                '1'+1=50
        System.out.println(c7);   //1 char

        int r1=c7;
        System.out.println(r1);//  int:49

        char charz='z';
        System.out.println(charz);

        System.out.println("===========================================");

        char a1='A';
        System.out.println(a1);

        int n1= 'A'+2;
        System.out.println(n1);

        char a2='@';
        char a3=64;
        System.out.println(a2);
        System.out.println(a3);

        System.out.println('@'+2);  //66


    }
}