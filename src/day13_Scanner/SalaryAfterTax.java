package day13_Scanner;
/*
5. write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
 */
import java.util.Scanner;
public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary=input.nextInt();

        System.out.println(" Enter your state tax rate: ");
        double stateTaxRate=input.nextDouble();//0.08
        double stateTax= salary * stateTaxRate;

        System.out.println("Enter your federal tax rate: ");
        double federalTaxRate=input.nextDouble();//0.2
        double federalTax= salary * federalTaxRate;

        double salaryAfterTax=salary- stateTax- federalTax;

        System.out.println("Your annual salary:$ "+salary);
        System.out.println("your state tax:$ "+stateTax);
        System.out.println("Federal Tax:$ "+federalTax);
        System.out.println("Your salary after tax:$ "+salaryAfterTax);


    }
}
