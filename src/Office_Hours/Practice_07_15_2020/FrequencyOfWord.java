package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str="cat cat cat cat cat cat cat cat";
        int count=0; //1+1 count the frequency

        while(str.contains("cat")){
            count++;

            str=str.replaceFirst("cat","");
        }

        System.out.println(count);



    }
}
