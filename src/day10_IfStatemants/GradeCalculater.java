package day10_IfStatemants;
/*
int grade=88;
  score < 0 || score > 100 ==> Invalid
grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F
 */
public class GradeCalculater {
    public static void main(String[] args) {
        int score=145;
        String grade="";

        if(score>=90 && score<= 100){ // 90 <= score <= 100
            grade="A";
        }else if(score>=80 && score<=89 ){  // 80 <= score <= 89
            grade="B";
        }else if(score>=70 && score<=79 ){ // 70 <= score <= 79
            grade="C";
        }else if(score>=60 && score<=69 ){// 60 <= score <= 69
            grade="D";

        }else{  // grade<0 and grade> 100
            grade="invalid score";
        }
        System.out.println(grade);


    }
}
