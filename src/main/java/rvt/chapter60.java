package rvt; 
import java.util.Scanner;

public class chapter60 {
    public static void main(String[] args) {
        ex3(args);   
    }

    public static void ex1(String[] args) {
        int sum = 0;

        int[] val = {0, 1, 2, 3}; 
        sum = val[0] + val[1] + val[2]+val[3];
        System.out.println("Sum of all numbers = " + sum);      
    }

    public static void ex2(String[] args){
        int[] val = {13, -4, 82, 17}; 
        int[] twice = new int[val.length];

        twice[0] = 13;
        twice[1] = -4;
        twice[2] = 82;
        twice[3] = 17;

        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }

    public static void ex3(String[] args){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};
    
        sum[0]= valA[0]+valB[0];
        sum[1]= valA[1]+valB[1];
        sum[2]= valA[2]+valB[2];
        sum[3]= valA[3]+valB[3];
    System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
   }


    public static void ex4(String[] args){
        

    }

    public static void ex5(String[] args){

    }


}