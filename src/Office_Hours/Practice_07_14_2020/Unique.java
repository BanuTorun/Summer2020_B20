package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {

        String str="ABABC";

        String expectedResult="";  //"C" is unique

        // str="ABABC";


        for(int j=0; j<=str.length()-1;j++){

            char ch=str.charAt(j); // A B A B C
            int count=0;            // frequency of char
            for(int i=0;i<=str.length()-1;i++){// help us to calculate the frequency of char and assign
                char each=str.charAt(i);
                if(each==ch){{
                    count+=1;
                }

                }

            }
            if (count == 1) {  // unique
                expectedResult+=ch;   // compaund asssigment order
            }
        }
        System.out.println(expectedResult);




    }
}
