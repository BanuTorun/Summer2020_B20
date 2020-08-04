package day08_LogicalOperator;

/*
write a program that can check if the the given number is odd or even number
Ex:num = 30output:30 is even number
 */
public class Odd_Even {
    public static void main(String[] args) {
        int number=101;

        boolean even=number%2==0;
        boolean odd= ! even;  //number%2!=0;

        if(even){
            System.out.println(number+" is even number.");
        }
        if(odd){
            System.out.println(number+" is odd number.");
        }
    }
}
