package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {

        // isEmpty();

        String name1="Cybertek";
        System.out.println(name1.isEmpty());

        String name2="";
        System.out.println(name2.isEmpty());

        // equals();

        String str1="Java";// string pool
        String str2=new String("Java");// heap

        System.out.println(str1+":"+str2);
        System.out.println(str1==str2);      // false

        System.out.println(str1.equals(str2));

        String str3=new String("Java");
        String str4=new String("Java");

        System.out.println(str3==str4);//false
        System.out.println(str3.equals(str4));//true

        String str5="Java";
        String str6="Java";

        System.out.println(str5==str6); // true
        System.out.println(str5.equals(str6)); // true

        String str7="JAVA";
        String str8="Java";
        System.out.println(str7.equals(str8));// false
       // System.out.println(str7==str8);// false

        //equalsIgnoreCase();

        // YES,Yes,yes,yEs
        System.out.println(str7.equalsIgnoreCase(str8));// true


        // contains();

        String str="I like java programing language";
        System.out.println(str.contains("python"));//false
        System.out.println(!str.contains("python")); //true

        System.out.println(str.contains("java"));// true
        System.out.println(str.contains("JAVA"));// false

        //startsWith();

        String s1="Banu";
        System.out.println(s1.startsWith("B"));// true
        System.out.println(s1.startsWith("J"));// false

        System.out.println(s1.startsWith("Ba"));// true

        System.out.println(s1.toLowerCase().contains("ba"));// true
//                         banu.contains("ba")


    }
}
