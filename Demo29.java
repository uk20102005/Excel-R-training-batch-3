import java.util.ArrayList;
import java.util.Scanner;

public class Demo29 {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        
   
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of friend " + (i + 1) + ": ");
            friends.add(scanner.nextLine());
        }
        
  
        System.out.println("\nThe names of your 10 friends are:");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println((i + 1) + ". " + friends.get(i));
        }

        scanner.close();
    }
}
