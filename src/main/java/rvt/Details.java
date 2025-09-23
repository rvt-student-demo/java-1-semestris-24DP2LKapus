package rvt;
import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int boltPrice = 5;
        final int uzgrieznuPrice = 3;
        final int paplaksnePrice = 1;

        System.out.println("Skrūvju skaits: ");
        int boltcount = Integer.valueOf(scanner.nextLine());
        

        System.out.println("Uzgriežņu skaits: ");
        int uzgrieznucount = Integer.valueOf(scanner.nextLine());

        System.out.println("Paplāksņu skaits: ");
        int paplaksnecount = Integer.valueOf(scanner.nextLine());

        if (uzgrieznucount < boltcount) {
            System.out.println("Pārbaudi pasūtījumu: Pa maz uzgriežņu");
        }
        else if (paplaksnecount > (boltcount*2)) {
            System.out.println("Pārbaudi pasūtījumu: Pa maz paplākšņu");
        }
        else
        System.out.println("Programma ir kārtībā");

        int summ = (boltPrice * boltcount)+( uzgrieznucount * uzgrieznuPrice )+ (paplaksnecount * paplaksnePrice);


        System.out.println("Kopēja cena: " + summ);




        
    }
    
}
