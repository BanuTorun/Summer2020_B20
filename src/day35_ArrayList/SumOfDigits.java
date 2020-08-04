package day35_ArrayList;
/*
2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

            HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
public class SumOfDigits {
    public static void main(String[] args) {
        String str="a1b2c3";
        int sum=0; //1+2+3==>6

        for(int i=0;i<=str.length()-1;i++){
            char each=str.charAt(i); // a,1,b,2,c,3
            if(each>=48 && each<=57){  // if cahar is between48~57, then it is digit
               sum+= Integer.parseInt(""+each); //conver character to Integer then add to the sum.

            }


        }
        System.out.print(sum);

    }
}
