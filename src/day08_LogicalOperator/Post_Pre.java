package day08_LogicalOperator;
/*

       3. manually calculate the following code fragements:
       1. int a = 200;
       int b = -a++ + - --a * a-- % 2
       b = ?

       2. int x = 300;
       int y = 400;
       int z = x + y - x * y +x / y;
*/
public class Post_Pre {

    public static void main(String[] args) {
        int a=200;//a=199
        int b=-a++ + - --a * a--%2;
        //   -(200)+ -(200) * 200 %2
        System.out.println(b);

        int x=300;
        int y=400;
        int z= x+y - x*y + x/y;
        //300+400-120000+0.75
        //-119,299.25

        System.out.println(z);
    }
}


