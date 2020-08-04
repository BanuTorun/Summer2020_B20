package day19_ForLoop;
/*
3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
 4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */
public class SumOfEvenOdd {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=100;i+=2){

                sum+=i;

        }
        System.out.println("The sum of even number "+sum);
        System.out.println("============================================");

        // task04
        //1 3 5 7 9 11....99

        int sumOfOdd=0;

        for(int i=1; i<=99; i +=2){
            sumOfOdd=+i;
        }
        System.out.println(sumOfOdd);

    }
}
