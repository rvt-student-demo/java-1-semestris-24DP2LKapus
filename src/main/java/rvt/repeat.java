package rvt;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        int num = 0;
        int even = 0;
        int odd = 0;
        for (int i = 1; i < 5; i++) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number >= 0) {
                sum = sum + number;
                num ++;
                if (number % 2 == 0 ) {
                even ++;
            }
            else {
                odd ++;
            }
            }
            
        }
        double average = sum / (num * 1.0);
        System.out.println("Thx! Bye!");
        System.out.println("The sum is: " + sum);
        System.out.println("Numbers: " + num);
        System.out.println("Average is: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
    
}
