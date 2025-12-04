package rvt;

public class Student {
    //non static
    private String name;
    private String lastname; // mutable
    private String presonalCode;
    
    public void setLastName(String s) {
        lastname = s;
    }

    //static
    public static String skola = "RVT";
    public static String file = "students.txt";


    int age;
    static String group = "DP2-2";


    //klases konstruktori
    public Student(String n, int a) {
        name = n;
        age = a;
    }
    // static metode
    public void introduceYourSelf() {
    }

    //non static metode
    public void hello() {
        System.out.println("hey");
    }
    
    public String gelLastName() {
        return lastname;
    }

    public String getPersonalCode() {
        return presonalCode;
        
    }
}
