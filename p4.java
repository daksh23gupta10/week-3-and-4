

import java.util.Scanner;

class Problem4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }

            }
        }

        input.close();
    }
}
