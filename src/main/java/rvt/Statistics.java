package rvt;

import java.util.*;

public class Statistics {
    private int count;
    private int sum; 
    ArrayList<Integer> numbers = new ArrayList<>();
    public Statistics() {
        sum = 0;
        count = 0;
    }
    
    public String toString() {
        return "Count:" + count + "\n" + 
        "Sum: " + sum + "\n" + "Average:" + average();
    }

    public void addNumber(int number) {
        count++;
        sum+=number;
    }

    public int getCount() {
        return count; 
    }

    public int sum(){
        for(int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            sum += num;
        }
        return sum;
    }

    public double average() {
        double avera = sum * 1.0 / count;
        return avera;
    }

  


}
