package rvt;

public class divisionbyThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
        
    }
    public static void divisibleByThreeInRange(int start, int end) {
        for (int i = start; i < end+1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        
    }
    
}
