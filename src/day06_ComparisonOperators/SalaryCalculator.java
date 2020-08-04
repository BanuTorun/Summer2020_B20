package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate =50;
        double stateTaxRate = 0.05;
        double federalTaxRate = 0.2;
        int weeklyHours= 45;

        double salary= rate*weeklyHours*48;
        double totalTax=salary*(stateTaxRate + federalTaxRate);
        double salaryAfterTax=salary-totalTax;

        System.out.println("salary before tax:"+salary+" USD");
        System.out.println("Total tax:"+totalTax+" USD");
        System.out.println("Take home salary:"+salaryAfterTax+" USD");




    }
}
