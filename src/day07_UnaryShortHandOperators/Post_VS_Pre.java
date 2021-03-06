package day07_UnaryShortHandOperators;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a);//11
        System.out.println(a);  //11

        int b=10;
        System.out.println(b++); //10
        System.out.println(b);   //11

        int c=25;
        int d=c++; //d=25;
        //c==26
        System.out.println(c);
        System.out.println(d);

        int e=25;
        e++;  // not immediatly pass current value
        System.out.println(e); //26

        System.out.println("=======================================");

        int x=8;
        int y=x--; //y=8
        System.out.println(y);// y=8
        System.out.println(x); //x=7

        System.out.println("========================================");

        int A=1; //A=1
        A=-A-- + A++/-A--*--A;
    //  A= -1  + 0  / -1 * -1
    //  A= -1  + 0 * -1
    //  A= -1
        System.out.println(A);

        System.out.println("=======================================");

        int B=50;//B=50
        B=--B + B++ + B-- + B++;
     // B=  49  +  49 + 50  +  49
     // B=  197
        System.out.println(B);







    }
}

