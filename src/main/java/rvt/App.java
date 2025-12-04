package rvt;
import java.util.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        
        Student student1 = new Student("Peteris", 5);
        student1.introduceYourSelf();
        System.out.println(student1.skola);
        

        Student student2 = new Student("John", 5);
        student2.introduceYourSelf();
        System.out.println(student2.skola);

        Student student3 = new Student("Durden", 7);
        student3.introduceYourSelf();
        System.out.println(student3.skola);

        student1.hello();

        student1.setLastName("Ozols");
            
    }
    
}



