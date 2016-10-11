
import java.util.ArrayList;
import javax.swing.*;;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies = new ArrayList<>();
	
	
	public void addBuddy(BuddyInfo bi) {
		buddies.add(bi);
	}
	
	public void removeBuddy(BuddyInfo bi) {
		buddies.remove(bi);
		
	}
	
	public static void main(String args[]) 
	{
		GUI gui = new GUI();
		gui.setUp();
	}

}
