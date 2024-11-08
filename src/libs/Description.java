package src.libs;

public class Description {

    static String blue = "\033[34m";
    static String reset = "\033[0m";

    public static void main() {
        System.out.println(blue + "\t------------------------------------------" + reset);
        System.out.println("\t\tCredit Account Application");
        System.out.println(blue + "\t------------------------------------------" + reset);
    }
}
