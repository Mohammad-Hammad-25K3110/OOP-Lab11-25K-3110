package Lab11_Tasks;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Confidential.txt");
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Confidential Data");
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Enter Designation (Faculty/Student): ");
        String designation = scanner.nextLine();
        boolean read = false;
        boolean write = false;
        boolean execute = false;
        if (designation.equalsIgnoreCase("Faculty")) {
            read = true;
            write = true;
            execute = true;
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);

        } else if (designation.equalsIgnoreCase("Student")) {
            read = true;
            write = false;
            execute = false;
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);
        } else {
            System.out.println("Invalid designation.");
            System.exit(0);
        }
        System.out.println("ACCESS RIGHTS STATUS");
        System.out.println("Read Permission : " + read);
        System.out.println("Write Permission : " + write);
        System.out.println("Execute Permission : " + execute);
        scanner.close();
    }
}
