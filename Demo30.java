import java.util.*;

public class Demo30 {

	public static void main(String[] args) {
		 ArrayList<Integer> araylist1 = new ArrayList<>();	    
	      araylist1.add(1000);
	      araylist1.add(700);
	      araylist1.add(900);
	      araylist1.add(0);
	      araylist1.add(400);
	      araylist1.add(6030);

	      System.out.println("Elements of the list: ");
	      
	      Iterator<Integer> iterate = araylist1.iterator();
	    
	      while (iterate.hasNext()) { 
	         System.out.println(iterate.next()); 
	      }
	}

}
