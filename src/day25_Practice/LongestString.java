package day25_Practice;
/*
1. Write a program that can return the longest string of text from a String array
 */
public class LongestString {

    public static void main(String[] args) {

        String[] arr={"Anam","Nickolas","Amir","Nurmamet","Abduljabar","Mamattursun","Gebremariam","Vasilicaputulica"};

        int maxLength=arr[0].length(); //  8

        for(String each:arr){   //8
            if(each.length()>maxLength){
                maxLength=each.length();
            }
        }

        for(String each:arr){
            if(each.length()==maxLength){
                System.out.println(each);
            }
        }

    }
}
