package day03_sequences_Variables;

/*
task:
        variables: salary, tax
        totalTax = salary * tax;
        salaryAfterTax =   salary - totalTax
        100000 ,     0.28;
        100000 * 0.28 = 28000;
        100000 - 28000 = 72000;

 */


public class SalaryCalculater {
    public static void main(String[] args) {

        int salary=100000;
        double tax=0.28;
        double totalTax= salary * tax;  //100000*0.28=28000
        double salaryAfterTax= salary-totalTax; //720000

        System.out.println(totalTax);
        System.out.println(salaryAfterTax);

        int a= 100;
        int A= 100;





    }
}
