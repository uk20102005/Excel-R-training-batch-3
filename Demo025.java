import java.util.Scanner;
public class Demo025 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String input)
     {
        return new StringBuilder(input).reverse().toString();
    }
}
