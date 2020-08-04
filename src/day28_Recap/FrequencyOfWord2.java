package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter the String:");
        String str=scan.next();
        System.out.println("Please enter the word: ");
        String word=scan.next();
        int l=word.length();

//       String str="catcatcatdogdog";
//                  (0,3)
//     String str="pythonpythoncatcatpythonpythonpython" ;


        int count=0; //"cat"
        for(int i=0;i<=str.length()-l;i++){
//            String a=str.substring(i,i+3);  for cat
            if(str.substring(i,i+l).equalsIgnoreCase(word)){
//          if(str.substring(i,i+6).equals("python")
                count++;
            }
        }
        System.out.println(count);

    }
}
