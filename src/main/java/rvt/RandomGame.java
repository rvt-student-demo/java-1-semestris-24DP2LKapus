package rvt;

import java.util.*;


public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random();

        System.out.println("Es domāju skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos.");
        System.out.println("Ievādi minejumu:");
       

        int result = random.nextInt(6) + 1;
        int atempt = 0;
        for ( int i = 0; i < 3; i++) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == result) {
                System.out.println("PAREIZI!!!");
                System.out.println("Tu esi uzvarējis spēli!");
                atempt++;

                break;
            }
            
            else {
                System.out.println("nepareizi");
            } 
        }

        if (atempt ==0) {
            System.out.println("Pareizais skaitlis bija: " + result);
            System.out.println("Tu esi zaudējis spēli");
        }
        
    }
}
    

