import java.io.Console;
import java.util.Scanner;

public class LoginSystem {
    private static final String USERNAME = "****";
    private static final String PASSWORD = "****";

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.print("Enter username: ");
            String inputUser = scanner.nextLine();

            char[] passwordChars;
            if (console != null) {
                passwordChars = console.readPassword("Enter password: ");
            } else {
                System.out.print("Enter password: ");
                passwordChars = scanner.nextLine().toCharArray();
            }

            String inputPass = new String(passwordChars);

            if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
                System.out.println("Login successful!");
                return true;
            } else {
                System.out.println("Incorrect credentials. Attempts left: " + (2 - attempts));
            }
        }

        System.out.println("Too many failed attempts.");
        return false;
    }
}
