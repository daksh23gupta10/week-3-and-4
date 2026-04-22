

import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Output
        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);

        input.close();
    }
}
