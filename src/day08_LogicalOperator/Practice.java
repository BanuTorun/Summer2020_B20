package day08_LogicalOperator;

public class Practice {
    public static void main(String[] args) {
        String firstName="Banu";
        String lastName="Yildirim";
        int age=37;
        String citizenShip="Turkish";

        boolean eligibleToVote= age>=18 && citizenShip=="USA";
        //                      19>=18   &&  "China"  == "USA"
        //                      true     &&       false    ====> false eligibleToVote
        //                      19>=18   &&   "USA"   == "USA"
        //                      true     &&        true      =====> true

        String fullName= firstName+" "+lastName;
        System.out.println(fullName+"is eligible to vote: "+eligibleToVote);
        // Banu Yildirim is eligible to vote: false




    }
}
