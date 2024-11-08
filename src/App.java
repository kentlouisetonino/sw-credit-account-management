/**
 * Author: Kent Louise Tonino
 * Program: Bachelor of Science, Computer Engineering
 * Student #: 2022-0076767
 * Course: CS6203 - Object Oriented Programming
 */
package src;

import java.util.Scanner;
import src.libs.CreditAccount;
import src.libs.Helper;

public class App {

    public static void main(String[] args) {
        Scanner mainOptionSc = new Scanner(System.in);
        CreditAccount.hello();

        // Clear the screen.
        Helper.clearTerminal();
        Helper.addNewline();
        Helper.addNewline();
    }
}
