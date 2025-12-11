package rvt;
import java.util.*;
public class Chapter44 {
    public static void main(String[] args) {   
        ex2();
}

public static void ex1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    name = name.trim();

     int spaceIndex = name.indexOf(" ");
        
    if (spaceIndex > 0) {
            String firstName = name.substring(0, spaceIndex);
            String lastName = name.substring(spaceIndex + 1);
            System.out.println(firstName + " " + lastName.toUpperCase());} 
    else {
            System.out.println(name);
        }


}
public static void ex2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String word = scanner.nextLine();
    int lenght = word.length();

    for(int i = 0; i <lenght; i++) {
        char index = word.charAt(i);
        System.out.println(index);
    }
}
public static void ex3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a name");
    
}
public static void ex4() {}
public static void ex5() {}
public static void ex6() {}
public static void ex7() {}
}
