package day11_NestedIf_Ternary;

/*
task1:
        precondition: minimum salary of 30k
         sub condition: minimum 2 years of job history

        task2:     1 monday
                   2 Tuesday
                   3 Wednesday
                     ...
                   7 Sunday
                  invalid ==> there is no such a day
         task3: write a program that find the number of days in a months
                    (MUST BE APPLY NESTED IF)

 */
public class NestedIf_Practice1 {
    public static void main(String[] args) {

        double salary=120000;
        int jobHistory=5;

        if(salary>=30000){
            if(jobHistory>=2){
                System.out.println("You are qualified");
            }else{ //job histories less than two
                System.out.println("You must have beenon job at least 2 years");
            }

        }else{
            System.out.println("You MUST earn at least $30K");
        }


    }
}
