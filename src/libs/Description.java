package src.libs;

public class Description {

    static String blue = "\033[34m";
    static String green = "\033[32m";
    static String reset = "\033[0m";

    public static void main() {
        System.out.println(blue + "\t----------------------------------------------" + reset);
        Helper.addNewline();
        System.out.println(green + "\t\tCredit Account Management App" + reset);
        Helper.addNewline();
        System.out.println(blue + "\t----------------------------------------------" + reset);
    }

    public static void options() {
        System.out.println("\t[1] New Account");
        System.out.println("\t[2] Credit Inquiry");
        System.out.println("\t[3] Purchase");
        System.out.println("\t[4] Payment");
        System.out.println("\t[5] Close Account");
        System.out.println("\t[6] Exit");
    }
}
