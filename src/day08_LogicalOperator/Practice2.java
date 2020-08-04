package day08_LogicalOperator;

public class Practice2 {

    public static void main(String[] args) {
        String firstName="Coner";
        String lastName="Mcgrager";
        int age=12;
        String citizen1="USA";
        String citizen2="France";

        boolean eligibleAge= age>=18;
        //                   12>=18 false
        boolean usCitizen=citizen1=="USA"|| citizen2=="USA";
        //                   "USA"=="USA" || "france"=="USA"
        //                     true       ||   false    =====> true

        boolean eligeableToVote=eligibleAge && usCitizen;
        //                       false      && true     ======> false
        String fullName=firstName+" "+lastName;
        System.out.println(eligeableToVote);// Conar McNugget usCitizen is eligible to vote for Trump :false
        System.out.println(fullName+" "+"is eligible to vote for Trump :"+" "+eligeableToVote);

    }
}
