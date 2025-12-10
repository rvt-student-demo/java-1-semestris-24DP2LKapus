package rvt;

import java.util.*;

public class Books {
    String name;
    int pages;
    int year;

    public Books(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                break;
            }
           
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Books(name, pages, year));
        }

        System.out.print("What information will be printed? ");
        String command = scanner.nextLine();

        for (Books book : books) {
            if (command.equals("everything")) {
                System.out.println(book.name + ", " + book.pages + " pages, " + book.year);
            } else if (command.equals("name")) {
                System.out.println(book.name);
            }
        }

        scanner.close();
    }
}