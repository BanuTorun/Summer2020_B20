package day11_NestedIf_Ternary;
/*
write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
                invalid: month<1 || month>12
 */
public class DaysInMonth2 {
    public static void main(String[] args) {

        int month=11;
        boolean validNumber=month>=1 && month<12;


        boolean days28=month==2;
        boolean days30=month==4|| month==6 || month==9 || month==11;


        String result="";

        if(validNumber){ // for 28 days for 30 days for 31 days

            if(days28){
                result="28 Days";
            }else if(days30){
                result="30 Days";
            }else{
                result="31 Days";
            }


        }else{ //invalid month
            result="invalid";
        }

        System.out.println(result);


    }
}
