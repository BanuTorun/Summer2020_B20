package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name="Cybertek School";
        //           01234567
        //charAt();

        char chr1=name.charAt(0);//'C'
        char chr2=name.charAt(5); //'t'

        System.out.println(chr1);
        System.out.println(chr2);

        // length();===> int

        int l=name.length();
        System.out.println(l);

        // last index:lenght of string-1
        int lastIndexNumber=name.length()-1;

        System.out.println(lastIndexNumber);//14

         char lastChar=name.charAt( lastIndexNumber);

        System.out.println( lastChar);// l

        //concat(str):concatenation

        String schoolName="Cybertek";
        schoolName.concat(" School"); //"Cybertek School"
        schoolName=schoolName.concat(" School");

        System.out.println(schoolName);

        String r1="Cybertek"+123+'A'+true;
        System.out.println(r1);

        String r2="Cybertek".concat("123");
        System.out.println(r2);

        // toLowerCase();

        String name1="CYBERTEK SCHOOL";
         name1 =name1.toLowerCase(); //"cybertek school"
        System.out.println(name1);

        //toUpperCase();

        String name2="banu";
        name2.toUpperCase();//
        name2=name2.toUpperCase();//"BANU"

        System.out.println(name2);
        //(CAN WE HAVE MORE TASK).toLowerCase


        //trim();

        String p="      Cybertek School       ";
              p=  p.trim(); //"Cybertek School"
        System.out.println(p);


    }
}
