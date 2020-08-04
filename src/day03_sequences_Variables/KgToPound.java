package day03_sequences_Variables;

/*
Task :
1 gallon= 3.8 lt

Task: KgToPound
        write a program that can convert kg to lb
            1kg = 2.2lb
                75kg
        variable: kg, pound
                pound = kg*2.2;

 */


public class KgToPound {
    public static void main(String[] args) {

        double kg=75;
        double pound= kg * 2.2;
        System.out.println(pound);

        double lt=65;
        double gallon=lt*3.8;
        System.out.println(gallon);


    }
}
