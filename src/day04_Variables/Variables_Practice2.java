package day04_Variables;

//double> float> long> int> short> byte

/*
There are only three rules to remember for legal identifiers:

1-The name must begin with a letter or the symbol $ or _.
2-Subsequent characters may also be numbers.
3-You cannot use the same name as a Java reserved word.
A reserved word is a keyword that Java has reserved so that you are not allowed to use it.
Java is case sensitive, so you can use versions of the keywords that only differ in case.
However, you are not recommended, though.
 */

public class Variables_Practice2 {
    public static void main(String[] args) {


        int iNum = 50;
        long lNum = iNum;  //50

        // int iNum2 = lNum;
        float fNum = lNum; // 50.0


        //    float fNum = 500;

        //    float 123fNum = 500;

        float fNum123 = 500;
        float num$ = 1000;

        //1,000,000
        int num1 = 1_000_000;

        System.out.println(num1);

        int num2 ;
        num2 = 5000;  // 5000

        System.out.println(num2); // 5000

        num2 = 2000;  // 2000

        System.out.println(num2);   // 2000




    }
}
