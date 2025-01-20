import java.util.HashSet;
import java.util.Scanner;

public class Demo031 {
    public static void main(String[] args) {
        // Create a HashSet to store heterogeneous data
        HashSet<Object> studentInfo = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Input student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        studentInfo.add(name);

        // Input student's roll number
        System.out.print("Enter student's roll number: ");
        int rollNumber = scanner.nextInt();
        studentInfo.add(rollNumber);

        // Clear the buffer before reading the address
        scanner.nextLine();

        // Input student's address
        System.out.print("Enter student's address: ");
        String address = scanner.nextLine();
        studentInfo.add(address);

        scanner.close();

        // Display student information from the HashSet
        System.out.println("\nStudent Information:");
        for (Object info : studentInfo) {
            if (info instanceof String) {
                // Check if it's a name or an address based on the content
                if (((String) info).matches("[a-zA-Z ]+")) {
                    System.out.println("Name: " + info);
                } else {
                    System.out.println("Address: " + info);
                }
            } else if (info instanceof Integer) {
                System.out.println("Roll Number: " + info);
            }
        }
    }
}
