

import java.util.Scanner;

class Problem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Check condition
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
