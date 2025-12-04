package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        removeLast(new ArrayList<String>());
    }


    public static void onlyTheseNumbers(){

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
    

    public static void listSize(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        String name = scanner.nextLine();

        while(!name.equals("")){
            names.add(name);
            name = scanner.nextLine();
        }
        System.out.println("In total: " + names.size());
        
        }
    

    public static void onTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        String name = scanner.nextLine();

        while(!name.equals("")){
            names.add(name);
            name = scanner.nextLine();
        }

        System.out.println("Search for?");
        String search = scanner.nextLine();

        int found = 0;
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(search)) {
                found++; 
            }
        }

        if (found > 0) {
            System.out.println(search + " was found!");
        }
        else {
            System.out.println(search + " was not found!");
        }
    }

    public static void removeLast(ArrayList<String> strings){
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        while(!input.equals("")) {
            strings.add(input);
            input = scanner.nextLine();
        }

        System.out.println(strings);
        strings.removeLast();
        System.out.println("");
        System.out.println(strings);
    }

    
}
