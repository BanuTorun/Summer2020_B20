package day03_sequences_Variables;

public class VariablePractice {
    public static void main(String[] args) {
        // 100 200
        byte num1= 100;
        short num2=200;
        int sum=num1+num2;
        System.out.println(sum);

        float num3=3.5f;
        double a=num3;

       // long b=num3; error

        long x= 100;
        float y=x;
        double z=x;
        System.out.println(x);
        System.out.println(y);  // float decimal so you get 100.0
        System.out.println(z);  // double decimal so you get 100.0

        // int p=3.5   error
        float f1=100;
        //float f2=100.0; error
        float f2=100.0f;

        System.out.println(f1);
        System.out.println(f2);








    }
}
