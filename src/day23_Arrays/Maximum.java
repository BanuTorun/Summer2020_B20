package day23_Arrays;
/*
int[] array = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array

 */
public class Maximum {
    public static void main(String[] args) {

        int[] numbers = {10,20, 3,4,5,6,7,-10,-100, 300, 400};

        int max=numbers[0];

        for( int i=1; i<=numbers.length-1;i++){

            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The max number is "+ max);


    }
}
