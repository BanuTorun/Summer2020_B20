package Office_Hours.Practice_06_23_2020;

public class IfStatement_Quiz {
    public static void main(String[] args) {
        int score=0;

        if( score==0){
          // 0==0===> true
            score+=50;  // score=score+50; =50;

        }
        if(score !=0){
        //  50   !=0 ===> true
        score+=50;     // score=100
        }

        System.out.println(score);

        System.out.println("=============================================");

        //Q3
        char grade='A';
        boolean passed= grade=='A'|| grade=='B';
        //               'A'=='A'
        //                true
        boolean passed2=grade=='C'|| grade=='D';
        //               'A'=='C' ||  'A'=='D'
        //                 false  ||   false======> false
        if(passed || passed2){
            System.out.println("You passed the exam");
        }else{
            System.out.println("you fail");

        }
        System.out.println("=================================================");

        //Q4
        boolean A=true;
        boolean B=!false;

        if(B){
            System.out.println("B");
        }else if(A){
            System.out.println("A");
        }else{
            System.out.println("C");
        }
        System.out.println("===============================================");
        //Q8
        int number=10;
        if(--number>10){
            System.out.println("Hello Cybertek "+number);
        }else if(number==9){
            System.out.println("Hello world "+number);
        }

        System.out.println("================================================");

        boolean x=true;
        boolean y= !x==false;
        boolean z=y;
        if(x){
            System.out.println("hello everone");
        }
        if(y){
            System.out.println("today is great");
        }
        if(z){
            System.out.println("we are improving everday");
 //          all if statement true
        }

        int X=10;
        int Y=X++;
//    y=11     x=12
        System.out.println(Y++ +" "+ X++ +" "+Y);
//                         10        11       11       12


    }

}
