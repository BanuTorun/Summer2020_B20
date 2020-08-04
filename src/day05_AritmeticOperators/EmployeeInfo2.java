package day05_AritmeticOperators;

public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName="Aaron";
        String lastName="Jones";
        char gender='M';
        int age=45;
        String companyName="Capitalone";
        String jobTitle="QA";
        boolean isFullTime=true;
        boolean isMarried=false;
        double salary=120_000.10;
        String fullName=firstName+" "+lastName;

        System.out.println("Employee's name is:"+firstName+" "+lastName);
        System.out.println(fullName+ "'s gender is:"+gender);
        System.out.println(fullName+" "+"is"+" "+age+" "+"years old");
        System.out.println(fullName+" "+"worked at"+companyName);
        System.out.println(fullName+"'s job title is:"+jobTitle);
        System.out.println(fullName+ "is full time:"+isFullTime);
        System.out.println(fullName+" "+"is married:"+isMarried);
        System.out.println(fullName+"'s salary is:"+salary+"$");

    }
}
