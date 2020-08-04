package day25_Practice;

public class ShortestString2 {
    public static void main(String[] args) {

        String[] arr={"Anam","Nickolas","Amir","Nurmamet","Abi","Ali","Joe"};

        int minLength=arr[0].length(); // 4

        for(String each:arr){  // to find out minmum length of the string in aarry
            int l=each.length(); // 4  8  4 8

            if(each.length()<minLength){
                minLength=each.length();
            }

        }


        for(String each:arr){ // to see how many string length in the array is matching with min
            if(each.length()==minLength){
                System.out.println(each);
            }
        }


    }
}
