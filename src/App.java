package src;

import java.util.ArrayList;
import java.util.Scanner;
import src.libs.CreditAccount;
import src.libs.Description;
import src.libs.Error;
import src.libs.Helper;
import src.libs.Input;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CreditAccount> accounts = new ArrayList<>();
        int mainOption;
        boolean invalidMainInput = false;

        while (true) {

            try {
                // Clear the screen.
                Helper.clearTerminal();
                Helper.addNewline();
                Helper.addNewline();

                // Show main app description.
                Description.main();
                Helper.addNewline();

                // Show error message for invalid input.
                if (invalidMainInput) {
                    Error.invalidMainInput();
                    Helper.addNewline();
                }

                // Show the options.
                Description.options();
                Helper.addNewline();

                // Handle the user option.
                Description.chooseOption();
                mainOption = sc.nextInt();
                sc.nextLine();
                invalidMainInput = false;
            } catch (Exception e) {
                invalidMainInput = true;
                sc.nextLine();
                continue;
            }

            if (mainOption == 1) {
                CreditAccount newCreditAccount = Input.option1(sc);
                accounts.add(newCreditAccount);
                sc.nextLine();
                continue;
            }

            if (mainOption == 2) {
                Input.option2(sc, accounts);
                sc.nextLine();
                continue;
            }

            if (mainOption == 3) {
                Input.option3(sc, accounts);
                sc.nextLine();
                continue;
            }

            if (mainOption == 4) {
                Input.option4(sc, accounts);
                sc.nextLine();
                continue;
            }

            if (mainOption == 5) {
                Input.option5(sc, accounts);
                sc.nextLine();
                continue;
            }

            if (mainOption == 6) {
                Helper.clearTerminal();
                break;
            }

            if (mainOption > 6 || mainOption < 1) {
                invalidMainInput = true;
                continue;
            }

            break;
        }

        try {
            sc.close();
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
