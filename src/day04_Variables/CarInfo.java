package day04_Variables;

public class CarInfo {

    /*
    Task:
    create a class called CarInfo:
            Year
            Brand
            Model
            Mileage
            Price
            print the info of the car
            Ex:
                2020
                BMW
                X5
                30000
                45000
            output:
                2020 BMW X5, 3000 miles, $45000
     */
    public static void main(String[] args) {
        int year=2020;
        String brand="BMW";
        String model="X5";
        short mileage=30000;
        double price=45000.5;
        String color="Red";
        //2020 BMW X5, 3000 miles, $45000

        System.out.println(year+" "+brand+" "+model+" "+color+" ,"+mileage +" miles, $"+price);






    }
}
