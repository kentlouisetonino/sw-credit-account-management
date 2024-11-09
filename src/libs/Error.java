package src.libs;

public class Error {

    public static void invalidMainInput() {
        System.out.println(Color.red + "\tInvalid input. Please try again." + Color.reset);
    }

    public static void invalidAnnualIncome() {
        System.out.println(Color.red + "\tInvalid annual income. Please try again." + Color.reset);
    }

    public static void invalidAccountNumber() {
        System.out.println(Color.red + "\tInvalid account number. Please try again." + Color.reset);
    }

    public static void invalidPurchaseAmount() {
        System.out.println(Color.red + "\tInvalid purchase amount. Please try again." + Color.reset);
    }
}
