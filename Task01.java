package Lab11_Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        String filePath = "C:\\Users\\Mohammad Hammad\\Desktop\\task01.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for (String item : list) {
                writer.write(item);
                writer.newLine();
            }
            writer.close();
            System.out.println("Data written to file successfully.");

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            File file = new File(filePath);
            if (file.delete()) {
                System.out.println("\nFile deleted successfully.");
            } else {
                System.out.println("\nFailed to delete the file.");
            }

        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        scanner.close();
    }
}
