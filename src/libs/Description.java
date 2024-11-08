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
}
