package rvt;
import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex7(args);
        
        
    }

    public static void ex1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Start: ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter End: ");
        int end = Integer.valueOf(scanner.nextLine());

        while (start <= end) {
            System.out.println(start);
            start ++;
        } 
    }


    public static void ex2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int start = 1;
        while (sum < n) {
            sum += + start ;
            start ++;
        }
        int formula = sum = (n*(n+1))/2;
        System.out.println("Loop summ : " + sum);
        System.out.println("formula summ: " + formula); 
    }


    public static void ex3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = Integer.valueOf(scanner.nextLine());
        int start = 1;
        int sum = 0;

        while (n+1 > start) {
            sum += start * start;
            start ++ ;


        }
        System.out.println("Loop summ: " + sum);
        int formula = (n*(n+1)*(2*n+1))/6;
        System.out.println("Formula summ: " + formula);

        
    }

    public static void ex4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high: ");
        int high = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        while(low < high+1) {
            sum += low;
            low ++;

        }

        System.out.println("Summ is: " + sum);

        
    }

    public static void ex5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        System.out.println("");
        String word = scanner.nextLine();
        int count = word.length();
        int start = 1;
        while (start < count) {
            System.out.println(word);
            start ++;
        }
        
        
    }

    public static void ex6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String word2 = scanner.nextLine();
        int dots = 30 - word1.length() - word2.length();
        String pieskaite = "";

        for (int i = 1; i < dots; i++) {
            pieskaite += ".";

        }
        System.out.println(word1+pieskaite+word2);
    }

    public static void ex7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        int wordi = word.length();
        for (int i = 0; i < wordi; i++) {
            System.out.println(word.charAt(i));
            

        }


        
    }
    
}
