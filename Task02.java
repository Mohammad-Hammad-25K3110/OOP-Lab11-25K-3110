package Lab11_Tasks;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Full Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Student ID : ");
        String id = scanner.nextLine();
        String fileName = name + ".txt";
        System.out.print("Enter PF Theory Marks : ");
        int pfTheory = scanner.nextInt();
        System.out.print("Enter PF Lab Marks : ");
        int pfLab = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> courses = new ArrayList<>();
        int totalCredits = 0;
        final int MAX_CREDITS = 15;
        if (pfTheory >= 50 && pfLab >= 50) {
            courses.add("OOP Theory");
            courses.add("OOP Lab");
            totalCredits += 6;
            System.out.println("OOP courses added.");
        } else {
            System.out.println("Student is NOT eligible for OOP courses.");
        }

        System.out.println("Enter courses or type 'done' to stop : ");
        while (true) {
            if (totalCredits >= MAX_CREDITS) {
                System.out.println("Maximum credit hours reached.");
                break;
            }

            System.out.print("Enter course name : ");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("done")) {
                break;
            }

            if (totalCredits + 3 > MAX_CREDITS) {
                System.out.println("Cannot add more courses. Max credits reached.");
                break;
            }
            courses.add(course);
            totalCredits += 3;
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("Student Name : " + name);
            writer.newLine();
            writer.write("Student ID : " + id);
            writer.newLine();
            writer.write("Total Credit Hours : " + totalCredits);
            writer.newLine();
            writer.write("Registered Courses : ");
            writer.newLine();
            for (String c : courses) {
                writer.write( c);
                writer.newLine();
            }
            writer.close();
            System.out.println("\nData written to file successfully.");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
