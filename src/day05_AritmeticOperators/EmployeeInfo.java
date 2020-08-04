package day05_AritmeticOperators;

/*
Warmup tasks:
        1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
Collapse




 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName="Banu";
        String lastName="Yildirim";
        char gender='F';
        int age=37;
        String companyName="Bank of America";
        String jobTitle="SDET";
        boolean isFullTime=true;
        boolean isMarried=true;
        double salary=75000.10;

        System.out.println("Employee's name is:"+firstName+" "+lastName);
        System.out.println(firstName+" "+lastName+ "'s gender is:"+gender);
        System.out.println(firstName+" "+lastName+" "+"is"+" "+age+" "+"years old");
        System.out.println("Banu Yildirim's company name is:"+companyName);
        System.out.println("Banu Yildirim's job title is:"+jobTitle);
        System.out.println("Banu Yildirim's is full time:"+isFullTime);
        System.out.println("Banu Yildirim's is married:"+isMarried);
        System.out.println("Banu Yildirim's salary is:"+salary+"$");







    }
}
