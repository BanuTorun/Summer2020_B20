package day09_Ifstatement;

//4. write a java program that can identify if a person is eligible to buy alcohol

public class Alcohol {
    public static void main(String[] args) {
        boolean hasID=true;
        int age=19;

        boolean eligible=hasID && age>=21;
        //               true  && false   ====> false
        String result="";

        if(eligible==true){
         //   System.out.println("Eligible to buy alcohol");
            result="Eligible to buy alcohol";
        }

        if(eligible==false){
           // System.out.println("Go buy your milk");
            result="You are not enough old to buy alcohol";

        }
        System.out.println(result);
    }
}
