package Office_Hours.Practice_07_15_2020;

public class FrequencyOfCatDog {
    public static void main(String[] args) {

        String str=" dog dog dog cat cat cat Dog Dog Dog ";

        int countOfDog=0; //1+1 count the frequency

        while(str.contains("dog")){
            countOfDog++;

            str=str.replaceFirst("dog","");
        }
        int countOfCat=0; //1+1 count the frequency

        while(str.contains("cat")){
            countOfCat++;

            str=str.replaceFirst("cat","");
        }

        System.out.println("Dog: "+countOfDog);
        System.out.println("Cat: "+countOfCat);



    }
}
