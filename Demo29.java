import java.util.Scanner;

public class Demo29 {
    public static void main(String[] args) {

        String[] friends = new String[10];
        

        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of friend " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }
        

        System.out.println("\nThe names of your 10 friends are:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + friends[i]);
        }
        
  
        scanner.close();
    }
}
