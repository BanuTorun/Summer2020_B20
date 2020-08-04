package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_practice {
    public static void main(String[] args) {

        ArrayList<String>students=new ArrayList<>();
        students.add("Sayem");
        students.add("Wagar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");


        // verif that the names: Ulku, Busra are contained in students list

        boolean r1=students.containsAll(Arrays.asList("Ulku,Busra,Muhtar"));
        System.out.println(r1);

        System.out.println("===================================================");

        ArrayList<String>group1=new ArrayList<>();

        // add all students names in your group

        group1.addAll(Arrays.asList("Ismail","Aras","Tulpar","Ruzgar","Berna"));

        System.out.println(group1);


        // verify your mentor and one of your closet friend's names are contained in the list

        boolean r2=group1.containsAll(Arrays.asList("Secil","Dillan"));
        System.out.println(r2);

        System.out.println("===========================================================");

        //tasks:
        //    1. write a program that can remove all the names named 'Ahmed' from the list of names

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed") );

        System.out.println(employees);

        employees.retainAll(  Arrays.asList("Ahmed", "Dawud")  );
        System.out.println(employees);
    }
}
