package rvt;

public     Statistics statistics = new Statistics();
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            }

            all.addNumber(number);
            if (number % 2 == 0) {
                even.addNumber(number);
            }
            else {
            odd.addNumber(number);
        }}

        System.out.println(statistics.toString());
    



        
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average()); {
    
}
