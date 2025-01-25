import java.util.ArrayList;

class FriendList {
    ArrayList<String[]> friends = new ArrayList<>();

    public FriendList() 
    {
        friends.add(new String[]
         {"Mahesh", "7842517366", "Hyderabad"});
        friends.add(new String[]
         {"Deepak", "8106722473", "Hyderabad"});
        friends.add(new String[]
         {"Reavanth", "6454546565", "Hyderabad"});
        friends.add(new String[]
         {"Bhanu", "9012345678", "Hyderabad"});
        friends.add(new String[]
         {"Bharath", "9177946328", "Hyderabad"});
    }

    public void displayFriends()
     {
        for (String[] friend : friends) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println();
        }
    }
}

public class Demo024
 {
    public static void main(String[] args)
     {
        FriendList friendList = new FriendList();
        friendList.displayFriends();
    }
}