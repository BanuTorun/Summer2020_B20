package day22_NestedLoop;
/*
 *******
 ******
 *****
 ****
 ***
 **
 *
 */
public class Nested_Loop5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
