import java.util.*;

public class Demo083 {
    void checkFirstCharacter(String n) {
        char firstChar = n.charAt(0);
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' ||
                firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U') {
            System.out.println("The first character is a vowel.");
        } else {
            System.out.println("The first character is a consonant.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = sc.nextLine();
        Demo083 obj = new Demo083();
        obj.checkFirstCharacter(n);
    }
}
