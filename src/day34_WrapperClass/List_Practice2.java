package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(100);
        List.add(30);
        List.add(410);
        List.add(310);
        List.add(210);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(Integer each:List){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

    }
}
