package day04_Variables;

/*
declear the following variables:
							num1 = 100;
							num2 = 10000;
							num3 = 3.5;
							num4 = 2.5f;
							num5 = 999999999999;
							num6 = 850000;
				print each of the variables above on the console
				double> float> long> int> short> byte
 */

public class Variables_Practice {
    public static void main(String[] args) {

        byte num1=100;
        short num2=10000;
        double num3=3.5;
        float num4=2.5f;
        long num5=999999999999l;
        int num6=850000;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        System.out.println(num1+ "/" +num2+ "/" +num3+ "/"+ num4+ "/"+ num5+"/" +num6);

    }
}
