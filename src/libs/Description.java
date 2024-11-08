package src.libs;

public class Description {

    public static void main() {
        System.out.println(Color.blue + "\t----------------------------------------------" + Color.reset);
        Helper.addNewline();
        System.out.println(Color.green + "\t\tCredit Account Management App" + Color.reset);
        Helper.addNewline();
        System.out.println(Color.blue + "\t----------------------------------------------" + Color.reset);
    }

    public static void options() {
        System.out.println("\t[ 1 ] Create Account");
        System.out.println("\t[ 2 ] Credit Inquiry");
        System.out.println("\t[ 3 ] Purchase");
        System.out.println("\t[ 4 ] Payment");
        System.out.println("\t[ 5 ] Close Account");
        System.out.println("\t[ 6 ] Exit");
    }
}
