package rvt;
import java.util.Scanner;

public class advancedastrology {
    public static void main(String[] args) {
        
        christmasTree(30);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");

        }
        
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for ( int i = 1; i < size+1; i++) {
            printSpaces(size-i);
            printStars(i);
            System.out.println();
        }   
    }

    public static void christmasTree(int height) {
        for (int i = 1; i< height+1; i++) {
            printSpaces(height-i);
            printStars((2*i)-1);
            System.out.println();
            
        }
        
    }
}