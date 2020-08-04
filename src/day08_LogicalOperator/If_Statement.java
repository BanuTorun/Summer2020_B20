package day08_LogicalOperator;

public class If_Statement {
    public static void main(String[] args) {
        int a=2000;
        int b=2000;


        if(a>b){
            System.out.println(a+" is the max number.");
        }

        if(b>a){
            System.out.println(b+" is the max number.");
        }

        if(a==b){
            System.out.println("Both are equal.");
        }
        System.out.println("=========================================================");

        boolean breakTime=true;

        if(breakTime==true){
            System.out.println("Take 15 minutes break!");
        }
        if(breakTime==false){
            System.out.println("Keep studying.");
        }
        System.out.println("==========================================================");

        boolean Corona=true;
        if(Corona==true){
            System.out.println("Buy more toilet papers.");
            System.out.println("Buy more hand saniteizer.");
            System.out.println("Social distance.");
            System.out.println("Stay at home.");
        }

    }
}
