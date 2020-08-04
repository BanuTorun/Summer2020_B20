package day13_Scanner;
/*
6. write a program that can display the selected browser
    1.1  declear a String variable called browserName
    1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
    1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary

 */
public class Browsers {
    public static void main(String[] args) {
        String browserName="safari";
        //boolean,long,float,double not use the switch

        switch(browserName){
            case "chrome":
                System.out.println("opening the chrome browser");
                break;

            case "firefox":
                System.out.println("opening the firefox");
                break;

            case "opera":
                System.out.println("opening the opera");
                break;

            case "safari":
                System.out.println("opening the safari");
                break;

            case "edge":
                System.out.println("opening the edge");
                break;

            default:
                System.out.println("invalid browser name");
        }
    }
}
