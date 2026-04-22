

import java.util.Scanner;

class Problem5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0;

        // Condition
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Output
        System.out.println("The bonus amount is " + bonus);

        input.close();
    }
}
