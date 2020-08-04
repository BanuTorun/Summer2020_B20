package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1=100;
        long l1=s1; //implicit casting : automaticlly done

        long l2=(long)s1; // if we implicit manually

        int I1=300;
        double D1=I1; //300/0

        double D2=(double)I1;
        System.out.println(I1);

        System.out.println("=============================");

        double d1=400.5555;
        int i1= (int)d1;   // 400
        System.out.println(i1);

        long L1=4400;
        short S1=(short)L1;
        System.out.println(S1);

        int n1=1000;
        byte b1=(byte)n1; // out of range byte (=-128,127)
        System.out.println(b1); //-24

        double m1=34.5;
        float f1=(float)m1; //34.5
        System.out.println(f1);

        long r1=-500;
        int p1=(int)r1;
        System.out.println(p1);

        long r2=-500;
        int p2=(short)r2;// you can

        long r3=13;
        byte t1=(byte)r3;
        System.out.println(t1);




    }
}
