import java.util.*;
public class Demo009{
   public void accpet_details(){
    String Customer_name = "sathi";
    long Account_number = "123456789";
     Double Balance = 10;
     Scanner scan =new Scanner(System.in);
     System.out.println("Customer Name: ");
     customer_name =scan.nextLine();
     System.out.println("Account Number: ");
     Account_number = scan.nextLong();
   }
   void Display_details(){
    System.out.println("Customer Name: "+customer_name);
    System.out.println("your balance is:"+Balance);
   }

public static void main (String[] args){
    example8 obj = new example8();
    obj.accpet_details();
    obj.Display_details();

}
}
