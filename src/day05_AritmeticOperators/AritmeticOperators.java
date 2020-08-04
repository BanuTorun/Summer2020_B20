package day05_AritmeticOperators;

public class AritmeticOperators {
    public static void main(String[] args) {
        System.out.println(20+3-2+1);
        //23-2+1=22
        System.out.println(20*3); //60
        System.out.println(2+3-1*4); //first * then left to right +,-
        System.out.println(10/3); //int/int===>int
        System.out.println(10.0/3); //double/int===>double
        System.out.println(10/3.0); // int/double===>double
        System.out.println(10.0/3.0); // double/double===> double
        System.out.println();

        System.out.println(5+2*4); //13
        System.out.println(10/2-3); //2
        System.out.println(8+12*2-4); //28
        System.out.println(4+17%2-1);// 4
        System.out.println(6-3*2+7-1); //6

        System.out.println(10/4.0);
        System.out.println(10%4);
        // 10/4=2
        //10-(4*2)=2
        System.out.println(30%8); // 30/8=3
        // remainder 30-(8*3)
        //  30-24=6
        System.out.println(99%4);
        // 99/4=24
        //remainder 99-(24*4)=3

    }
}
