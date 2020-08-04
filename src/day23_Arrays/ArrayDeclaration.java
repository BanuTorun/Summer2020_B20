package day23_Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        String[] names={"Banu", "ismail","Aras","Tulpar"};       //Anonymous array
        int numbers[]={38,43,6,4};

        String [] months=new String[12];                          // fixed size default value null
        System.out.println(months[3]);
        months[3]="March";
        System.out.println(months[3]);

        for(int i=1;i<months.length-1;i++) {
            System.out.println(months[i]);
        }
        double[]prices=new double[]{1.99,2.99,3.54,2.35,3.15};
        for(int i=0;i<prices.length;i++){
            System.out.println(prices[i]);

        }
    }
}
