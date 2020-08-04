package day10_IfStatemants;

import org.w3c.dom.ls.LSOutput;

/*
write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
 */
public class Character_Identify {
    public static void main(String[] args) {
        char character='@';
        boolean isAlphabetic= (character>=65 && character<= 90) || ( character >=97 && character<=122);
        //                          upper case letter                           lover case letter
        //                47< character<57
        boolean isDigit= ( character>= 47 && character<=57);
        String alphabet="";

        //boolean specialCharacter=!isAlphabetic && !isDigit;
        boolean specialChar=isAlphabetic==false && isDigit==false;

        if(isAlphabetic==true){

          //  System.out.println(character+ " is a Alphabetic");
            alphabet =character+ " is a Alphabetic";

        }else{
            alphabet =character+ " is not a Alphabetic";
          //  System.out.println(character+ " is not a Alphabetic");
        }
        //if(isAlphabetic==false){
         //   System.out.println(character+ " is not a Alphabetic");

        System.out.println(alphabet);

        String digit="";
        if(isDigit==true){
            digit= character+" is a digit";
        }else{
            digit= character+" is not a digit";
        }
        System.out.println(digit);

        String specialCharacter="";

        if(specialChar==true){
            specialCharacter= character+" is a special";
        }else{
            specialCharacter= character+" is not a special";
        }
        System.out.println(specialCharacter);
    }



}


