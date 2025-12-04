package rvt;

import java.util.*;

public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return this.value;
    }

    public Counter() {
        this.value = 0;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value = value + increaseBy;
        }

    }


    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value = value + decreaseBy;
        }
    }


    public static void main(String[] args) {
        Counter counter = new Counter(7);
        Counter countertwo = new Counter();

        counter.increase();
        System.out.println(counter.value);
        counter.decrease();
        System.out.println(counter.value);
        counter.increase(1);
        System.out.println(counter.value);
        counter.decrease(1);
        System.out.println(counter.value);

        countertwo.increase();
        System.out.println(countertwo.value);
        countertwo.decrease();
        System.out.println(countertwo.value);
        countertwo.increase(1);
        System.out.println(countertwo.value);
        countertwo.decrease(1);
        System.out.println(countertwo.value);
        

        
    }

    
    
}
