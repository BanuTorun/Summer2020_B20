package day08_LogicalOperator;

/*
2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 liter = 1/3.785 gollons
 */
public class LitersToGallons {

    public static void main(String[] args) {
        double liters= 200;
        double gallons=liters / 3.785;

        System.out.println(liters+" litters equal to"+" "+(int)gallons+" gallons");

    }
}
