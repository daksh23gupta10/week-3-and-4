

import java.util.Scanner;

class Problem6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check valid Gregorian year
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582");
        } else {

            // 🔹 Method 1: Multiple if-else
            boolean isLeapYear = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }

            System.out.println("Using multiple if-else:");
            if (isLeapYear) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }

            // 🔹 Method 2: Single condition
            boolean isLeapYear2 =
                    (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            System.out.println("Using single condition:");
            if (isLeapYear2) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }

        input.close();
    }
}
