//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input year");
        int year = scan.nextInt();
        scan.close();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Year is a leap year");

                } else
                    System.out.println("Year is not a leap year");
            } else
                System.out.println("Year is a leap year");
        } else {
            System.out.println("Year is not a leap year");
        }
    }
}