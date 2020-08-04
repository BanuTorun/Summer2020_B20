package day24_Arrays;

import java.util.Arrays;

/*
for(dataType each : collection of data)
 */
public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9-1,-2,-3};

        for(int i=0;i<=arr.length-1;i++){ // i is the index number
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("=========================================");

        for(int each: arr){ //each represent the elements
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("===========================================");

        String[] name={"Ismail","Banu","Aras","Tulpar"};
        System.out.println(Arrays.toString(name));

        for(String each: name){
            System.out.print(each+" ");
        }
    }
}
