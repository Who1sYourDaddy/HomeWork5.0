package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( "Task 1" );
        int cycle = 0;
        while (cycle < 10) {
            cycle = cycle + 1;
            System.out.println(cycle);
        }
        for (int cycleTwo = 10; cycleTwo >= 1; cycleTwo--) {
        System.out.println( cycleTwo );
        }

        System.out.println( "Task 2" );

        int curentFriday = 7;
        for (int friday = curentFriday; friday <= 31; friday += 7) {

            System.out.println("Сегодня пятница, " + friday + "-е число, необходимо подготовить отчёт");
        }
        System.out.println( "Task 3" );


            for (int period = 0; period <= 2121; period += 79) ;  {


            System.out.println( + period + );
        }
    }
}
