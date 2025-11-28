package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String product = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = scanner.nextDouble();

        System.out.print("Ekspress piegade (0 == ne, 1 == ja): ");
        int expressDelivery = scanner.nextInt();

        
        double deliveryFee = 0.0;
        if (price < 10) {
            deliveryFee = 2.0;         
        }
        if (expressDelivery == 1) {
            deliveryFee += 3.0;        
        }

        System.out.println("Rēķins:");
        System.out.println("Prece: " + product);
        System.out.println("Piegāde: " + deliveryFee);
        System.out.println("Kopā: " + (price + deliveryFee));

        
    }
}