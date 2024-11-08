package src.libs;

import java.util.Random;
import java.util.Scanner;

public class Input {

    public static CreditAccount option1() {
        Scanner sc = new Scanner(System.in);
        boolean invalidAnnualIncome = false;

        // For generating random number.
        Random random = new Random();
        String generateNumber = String.format("%04d", random.nextInt(10000));

        // Variables needed to create the credit account.
        String name;
        double annualIncome;
        int accountNumber = Integer.parseInt(generateNumber);

        while (true) {
            try {
                // Clear the screen.
                Helper.clearTerminal();
                Helper.addNewline();
                Helper.addNewline();

                // Show the option description.
                Description.option1();
                Helper.addNewline();

                // Show error message for invalid annual income.
                if (invalidAnnualIncome) {
                    Error.invalidAnnualIncome();
                    Helper.addNewline();
                }

                // Show the generated account number.
                System.out.println("\tAccount Number: " + generateNumber);

                // Ask user to input the account name.
                System.out.print("\tAccount Name: ");
                name = sc.nextLine();

                // Ask user to input the annual income.
                System.out.print("\tAnnual Income: ");
                annualIncome = sc.nextDouble();

                if (annualIncome < 1) {
                    invalidAnnualIncome = true;
                    sc.nextLine();
                    continue;
                }
            } catch (Exception e) {
                invalidAnnualIncome = true;
                sc.nextLine();
                continue;
            }

            break;
        }

        // Create the credit account.
        CreditAccount newAccount = new CreditAccount(accountNumber, name, annualIncome);

        try {
            sc.close();
        } catch (Exception e) {
            return newAccount;
        }

        return newAccount;
    }
}
