import java.util.Scanner;
public class Demo007{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your phonenumber:");
        String phonenumber = input.nextLine();
        System.out.println("Hello, my name is " + name + " and my age is " + age + " and my phonenumber is " + phonenumber);

    }
   
}
