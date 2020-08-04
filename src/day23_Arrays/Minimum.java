package day23_Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] numbers = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
        //                0  1
        int min=numbers[0];

        for(int i=1; i<=numbers.length-1;i++){

            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("The min number is: "+min);
    }
}
