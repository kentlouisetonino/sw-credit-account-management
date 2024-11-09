package src.libs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Input {

    public static CreditAccount option1(Scanner sc) {
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
        return newAccount;
    }

    public static void option2(Scanner sc, ArrayList<CreditAccount> accounts) {
        boolean invalidAccountNumber = false;
        int accountNumber;
        CreditAccount account = null;
        String tryAgain;

        while (true) {
            try {
                // Clear the screen.
                Helper.clearTerminal();
                Helper.addNewline();
                Helper.addNewline();

                // Show the option description.
                Description.option2();
                Helper.addNewline();

                // Show error message for invalid annual income.
                if (invalidAccountNumber) {
                    Error.invalidAccountNumber();
                    Helper.addNewline();
                }

                // Show the generated account number.
                System.out.print(Color.yellow + "\tEnter Account Number" + Color.reset + ": ");
                accountNumber = sc.nextInt();

                // Check the account.
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getId() == accountNumber) {
                        account = accounts.get(i);
                    }
                }

                // Check if savings account is null.
                if (account == null) {
                    invalidAccountNumber = true;
                    sc.nextLine();
                    continue;
                }

                // Display account information.
                System.out.println("\tName: " + account.getName());
                System.out.println("\tAnnual Income: " + account.getAnnualIncome());
                System.out.println("\tCredit Limit: " + account.getCreditLimit());
                System.out.println("\tCredit Balance: " + account.getCreditBalance());
                System.out.println("\tAllowable Purchase Amount: " + account.getPurchaseAmount());

                // Ask if want to check another account.
                Helper.addNewline();
                System.out.print(Color.yellow + "\tCheck different account (y/n)" + Color.reset + ": ");
                tryAgain = sc.next();

                // Handle the response.
                if (tryAgain.contains("y")) {
                    invalidAccountNumber = false;
                    account = null;
                    sc.nextLine();
                    continue;
                }
            } catch (Exception e) {
                invalidAccountNumber = true;
                sc.nextLine();
                continue;
            }

            break;
        }
    }

    public static void option3(Scanner sc, ArrayList<CreditAccount> accounts) {
        boolean invalidAccountNumber = false;
        boolean invalidPurchaseAmount = false;
        int accountNumber;
        double purchaseAmount;
        CreditAccount account = null;
        String tryAgain;

        while (true) {
            try {
                // Clear the screen.
                Helper.clearTerminal();
                Helper.addNewline();
                Helper.addNewline();

                // Show the option description.
                Description.option3();
                Helper.addNewline();

                // Show error message for invalid account number.
                if (invalidAccountNumber) {
                    Error.invalidAccountNumber();
                    Helper.addNewline();
                }

                // Show error message for invalid purchase amount.
                if (invalidPurchaseAmount) {
                    Error.invalidPurchaseAmount();
                    Helper.addNewline();
                }

                // Show the generated account number.
                System.out.print(Color.yellow + "\tEnter Account Number" + Color.reset + ": ");
                accountNumber = sc.nextInt();

                // Check the account.
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getId() == accountNumber) {
                        account = accounts.get(i);
                    }
                }

                // Check if savings account is null.
                if (account == null) {
                    invalidAccountNumber = true;
                    invalidPurchaseAmount = false;
                    sc.nextLine();
                    continue;
                }

                try {
                    System.out.print(Color.yellow + "\tEnter Purchase Amount" + Color.reset + ": ");
                    purchaseAmount = sc.nextDouble();

                    if (purchaseAmount > account.getPurchaseAmount()) {
                        invalidAccountNumber = false;
                        invalidPurchaseAmount = true;
                        sc.nextLine();
                        continue;
                    }
                } catch (Exception e) {
                    invalidAccountNumber = false;
                    invalidPurchaseAmount = true;
                    sc.nextLine();
                    continue;
                }

                // Computation for balances and setting the new states.
                account.setCreditBalance(account.getCreditBalance() + purchaseAmount);
                double interest = account.getCreditBalance() * 0.03;
                account.setCreditBalance(account.getCreditBalance() + interest);
                account.setPurchaseAmount(account.getCreditLimit() - account.getCreditBalance());

                // Display account information.
                System.out.println("\tUpdated Credit Balance: " + account.getCreditBalance());
                System.out.println("\tUpdated Allowable Purchase Amount: " + account.getPurchaseAmount());

                // Ask if want to check another account.
                Helper.addNewline();
                System.out.print(Color.yellow + "\tCheck different account (y/n)" + Color.reset + ": ");
                tryAgain = sc.next();

                // Handle the response.
                if (tryAgain.contains("y")) {
                    invalidAccountNumber = false;
                    account = null;
                    sc.nextLine();
                    continue;
                }
            } catch (Exception e) {
                invalidAccountNumber = true;
                sc.nextLine();
                continue;
            }

            break;
        }
    }

    public static void option4(Scanner sc, ArrayList<CreditAccount> accounts) {
        boolean invalidAccountNumber = false;
        boolean invalidPaymentAmount = false;
        int accountNumber;
        double paymentAmount;
        CreditAccount account = null;
        String tryAgain;

        while (true) {
            try {
                // Clear the screen.
                Helper.clearTerminal();
                Helper.addNewline();
                Helper.addNewline();

                // Show the option description.
                Description.option3();
                Helper.addNewline();

                // Show error message for invalid account number.
                if (invalidAccountNumber) {
                    Error.invalidAccountNumber();
                    Helper.addNewline();
                }

                // Show error message for invalid payment amount.
                if (invalidPaymentAmount) {
                    Error.invalidPaymentAmount();
                    Helper.addNewline();
                }

                // Handle the account number.
                System.out.print(Color.yellow + "\tEnter Account Number" + Color.reset + ": ");
                accountNumber = sc.nextInt();

                // Check the account.
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getId() == accountNumber) {
                        account = accounts.get(i);
                    }
                }

                // Check if savings account is null.
                if (account == null) {
                    invalidAccountNumber = true;
                    invalidPaymentAmount = false;
                    sc.nextLine();
                    continue;
                }

                try {
                    System.out.print(Color.yellow + "\tEnter Payment" + Color.reset + ": ");
                    paymentAmount = sc.nextDouble();

                    if (paymentAmount > account.getCreditBalance()) {
                        invalidAccountNumber = false;
                        invalidPaymentAmount = true;
                        sc.nextLine();
                        continue;
                    }
                } catch (Exception e) {
                    invalidAccountNumber = false;
                    invalidPaymentAmount = true;
                    sc.nextLine();
                    continue;
                }

                // Computation for balances and setting the new states.
                account.setCreditBalance(account.getCreditBalance() - paymentAmount);
                account.setPurchaseAmount(account.getCreditLimit() - account.getCreditBalance());

                // Display account information.
                System.out.println("\tUpdated Credit Balance: " + account.getCreditBalance());
                System.out.println("\tUpdated Allowable Purchase Amount: " + account.getPurchaseAmount());

                // Ask if want to check another account.
                Helper.addNewline();
                System.out.print(Color.yellow + "\tCheck different account (y/n)" + Color.reset + ": ");
                tryAgain = sc.next();

                // Handle the response.
                if (tryAgain.contains("y")) {
                    invalidAccountNumber = false;
                    account = null;
                    sc.nextLine();
                    continue;
                }
            } catch (Exception e) {
                invalidAccountNumber = true;
                sc.nextLine();
                continue;
            }

            break;
        }
    }
}
