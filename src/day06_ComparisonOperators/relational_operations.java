package day06_ComparisonOperators;

public class relational_operations {
    public static void main(String[] args) {
        boolean r1=10>9;
        System.out.println(r1);//true

        boolean r2=100<900;
        System.out.println(r2);//true

        //>=
         boolean r3=87 >= 85;
        System.out.println(r3);

        boolean r4=877 >= 878;
        System.out.println(r4);

        //=<
        boolean r5=200<=300;
        System.out.println(r5);

        //== equal

        boolean r6=900==800;
        System.out.println(r6);

        boolean r7=true==false;
        System.out.println(r7);

        boolean r8="Muhtar"=="Good guy";
        System.out.println(r8);

        boolean r9="Muhtar"=="Muhtar";
        System.out.println(r9);

        boolean r10="muhtar"=="MUHTAR";
        System.out.println(r10);

        //!== opposite of equal

        boolean r11="Muhtar"!="Bad Guy";
        System.out.println(r11);

        boolean r12=true!=false;
        System.out.println(r12);

        boolean result1='A'==65; //true
        System.out.println(result1);

        boolean result2=100==100.0; // $100 and $100.0 same
        System.out.println(result2);// true

        boolean result3=10==10.9999999;
        System.out.println(result3);

        boolean result4="100"=="100.0";//false
        System.out.println(result4);

        int number=100;
        boolean even=number%2==0;
        boolean odd=number%2!=0;
        System.out.println(even);
        System.out.println(odd);









    }
}
