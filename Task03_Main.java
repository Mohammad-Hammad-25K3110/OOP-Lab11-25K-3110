package Lab11_Tasks;
import java.util.Scanner;

public class Task03_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task03<String, String> stored = new Task03<>("admin", "123");
        System.out.print("Enter Username : ");
        String user = scanner.nextLine();
        System.out.print("Enter Password : ");
        String pass = scanner.nextLine();
        if (stored.validate(user, pass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid credentials. Program terminated.");
            System.exit(0);
        }
        scanner.close();
    }
}
