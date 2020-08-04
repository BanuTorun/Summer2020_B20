package day15_String;

public class substring_Method {
    public static void main(String[] args) {

        String sentence="Java is fun";
       //                012345678910
       //substring(beg index, end index)
       String word1=sentence.substring(0 ,4); // dont write 3 because exclusive should write 4
        // or String word=sentence.substring(0 ,3+1);
        System.out.println(word1);

        String word2=sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("========================================================");

        String sentence2="I Like Movies and TV Series";
        //                01234567891011121314
        String word3=sentence2.substring(7 ,13);// first included 7 last excluded 13 for Movie
        System.out.println(word3);

        System.out.println("=========================================================");

        String firstName="MUHTAR";
        String firstCharacter=firstName.substring(0 ,1);
        String rest=firstName.substring(1, firstName.length());
        //String rest=firstName.substring(1, 6); UHTAR

        firstName=firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstCharacter);
        System.out.println(rest);

        System.out.println(firstName);

        System.out.println("======================================================");
        String lastName="school";
        String firstChar=lastName.substring(0,1);//s
        String remaining=lastName.substring(1);//chool

        lastName=firstChar.toUpperCase()+remaining.toLowerCase();//"School"

      //  System.out.println(firstChar);
       // System.out.println(remaining);
        System.out.println(lastName);

        System.out.println("=====================================================");

         String s="I like Game Of Thrones";
         //        01234567
         String series=s.substring(7);
        System.out.println(series);

        String s2="I like Java programming Language";
        //         01234567
        String language=s2.substring(7);
        System.out.println(language);





    }
}
