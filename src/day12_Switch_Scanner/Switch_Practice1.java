package day12_Switch_Scanner;
/*
1-Monday, 2-Tuesday, 3-Wednesday ,4-Thursday, 5-Friday6-Saturday,7-Sunday, othervise -invalid
 */
public class Switch_Practice1 {
    public static void main(String[] args) {

        long c=10;// 10L
        float d=10;//10.0f
        double e=10;//10.0
//      you can not use long,float,double because of switch use a single data not decimal or L,f
        int num=4;
        String result="";

        switch(num){

            case 1:
                result="Monday";
                break;
            case 2:
                result="Tursday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result=" Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;

            default:
                result="Invalid";



        }

        System.out.println(result);

    }
}
