package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[]words={"C#","C#","Java","Paython","Paython","C++","Ruby"};

        for(String each:words){
            String s = words[0];
            int count=0;
            for(String b :words){ // b represents each elements in array
                if(s.equals(b)){
                    count++;
                }

            }
            if(count==1){   // which is uniqe then print
                System.out.println(s);
            }

        }

        String s = words[0];
        int count=0;

        for(String b :words){ // b represents each elements in array
            if(s.equals(b)){
                count++;
            }

        }
        if(count==1){   // which is uniqe then print
            System.out.println(s);
        }

    }
}
