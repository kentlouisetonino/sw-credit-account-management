package src.libs;

public class Error {

    public static void invalidMainInput() {
        System.out.println(Color.red + "\tInvalid input. Please try again." + Color.reset);
    }

    public static void invalidAnnualIncome() {
        System.out.println(Color.red + "\tInvalid annual income. Please try again." + Color.reset);
    }
}
