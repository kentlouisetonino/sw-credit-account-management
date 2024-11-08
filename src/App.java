/**
 * Author: Kent Louise G. Tonino
 * Program: Bachelor of Science, Computer Engineering
 * Student #: 2022-0076767
 * Course: CS6203 - Object Oriented Programming
 */
package src;

import java.util.Scanner;
import src.libs.Color;
import src.libs.Description;
import src.libs.Error;
import src.libs.Helper;

public class App {

    public static void main(String[] args) {
        Scanner mainOptionSc = new Scanner(System.in);
        int mainOption;
        boolean invalidMainInput = false;

        while (true) {
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

            // Handle the input.
            try {
                System.out.print(Color.yellow + "\tChoose an option" + Color.reset + ": ");
                mainOption = mainOptionSc.nextInt();
                invalidMainInput = false;
            } catch (Exception e) {
                invalidMainInput = true;
                mainOptionSc.next();
                continue;
            }

            System.out.println(mainOption);
        }

    }
}
