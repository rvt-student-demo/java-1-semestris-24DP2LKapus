package rvt;

import java.util.Scanner;

public class produkts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Produkta nosaukums: ");

        String name = scanner.nextLine();
        
        System.out.println("Produkta daudzums: ");

        int daudzums = Integer.valueOf(scanner.nextLine());

        System.out.println("Produkta cena: ");

        double cena= Double.valueOf(scanner.nextLine());

        double summa= daudzums * cena;

        System.out.println(name + "cena: " + cena + " daudzums: " + daudzums +", Totalprice: " + summa);





        
    }

    
}
