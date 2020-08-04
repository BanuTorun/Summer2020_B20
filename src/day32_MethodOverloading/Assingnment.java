package day32_MethodOverloading;

import java.util.Arrays;

/*
Assignments:
tasks2:
    1. create a method that can combine 2 arrays of integers
    2. create a method that can combine 2 arrays of double
    3. create a method that can combine 2 arrays of String
    4. create a method that can combine 2 arrays of char

    first solution: DO NOT use method overloading
    second solution: apply method overloading

 */
public class Assingnment {

    public static void main(String[] args) {

        int[]arr1={43,38,6,4};
        int []arr2={1,2,3,};




    }


//    first solution: DO NOT use method overloading

    public static void combine2ArraysOfIntegers(int[]arr1,int[]arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

    }

    public static void combine2ArraysOfDouble(double[]arr1,double[]arr2){
        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (double each : arr2) {
            arr3[i] = each;
            i++;
        }
    }

    public static void combine2ArraysOfString(String[]arr1,String[]arr2){
        String [] arr3 = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }

    }
    public static void combine2ArraysOfChar(char[]arr1,char[]arr2){

        char [] arr3 = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (char each : arr2) {
            arr3[i] = each;
            i++;
        }

    }

    //=========================================================================================

    //    second solution: apply method overloading

    public static void combine2Arrays(int[]arr1,int[]arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

    }
    public static void combine2Arrays(double[]arr1,double[]arr2){

        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (double each : arr2) {
            arr3[i] = each;
            i++;
        }

    }

    public static void combine2Arrays(String[]arr1,String[]arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }

    }
    public static void combine2Arrays(char[]arr1,char[]arr2){
        char [] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (char each : arr2) {
            arr3[i] = each;
            i++;
        }

    }

}
