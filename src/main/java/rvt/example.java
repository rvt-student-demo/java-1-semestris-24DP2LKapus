package rvt;
import java.lang.reflect.Array;
import java.util.*;


public class example {

   public static void main(String[] args) {

      indexOf();
   }

   public static void PrintslastName(){
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> names = new ArrayList<>();

      
      String line = scanner.nextLine();

      while (line.equals("")) {
         names.add(line);
         line = scanner.nextLine();
      }

      System.out.println();

      
         int last = names.size() - 1;
         System.out.println( names.get(last));
   }



   public static void PrintsFirstnLastName(){
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();

    String name = scanner.nextLine();
    while(!name.equals("")) {
        names.add(name);
        name = scanner.nextLine();
    }

    int last = names.size() - 1;
    String first = names.get(0);
    System.out.println(first);
    System.out.println(names.get(last));

   }


   public static void rememberThisNumbers() {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      int number = Integer.valueOf(scanner.nextLine());

      while (number != -1) {
         numbers.add(number);
         number = Integer.valueOf(scanner.nextLine());
      }

      while(true) {
         for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
         }
         break;
      }

   }
      

   public static void fromWheretoWhere() {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      int number = Integer.valueOf(scanner.nextLine());

      while( number != -1) {
         numbers.add(number);
         number = Integer.valueOf(scanner.nextLine());
      }

      System.out.println("From where?");
      int from = Integer.valueOf(scanner.nextLine());

      System.out.println("To where?");
      int to = Integer.valueOf(scanner.nextLine());

      for (int i = from; i <= to; i++) {
         System.out.println(numbers.get(i));
      }
   }



   public static void indexOf() {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      int number = Integer.valueOf(scanner.nextLine());
      while (number != -1) {
         numbers.add(number);
         number = Integer.valueOf(scanner.nextLine());
      }

      System.out.println("Search for?");
      int search = Integer.valueOf(scanner.nextLine());
      for (int i = 0; i < numbers.size(); i++) {
         if (numbers.get(i) == search) {
            System.out.println(search + " is at index " + i);
         }
      }
   }







}