package day21_loops;

public class DoWhile {
    public static void main(String[] args) {
        boolean result = false;

        while (result) {
            System.out.println("Hello World"); // no print because first check statement statement false
        }
        System.out.println("================================================");

        do{ // just do it

            System.out.println("Hello World");

        }while(result);
    }
}
