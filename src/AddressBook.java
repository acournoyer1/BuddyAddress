
import java.util.ArrayList;

/*
* Wazaaaaap
*/

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies = new ArrayList<>();
	
	
	public void addBuddy(BuddyInfo bi) {
		buddies.add(bi);
	}
	
	public void removeBuddy(BuddyInfo bi) {
		buddies.remove(bi);
		
	}
	
	public static void main(String args[]) {
		System.out.print("Top Kek");
		BuddyInfo bI = new BuddyInfo();
		AddressBook ab = new AddressBook();
		ab.addBuddy(bI);
		ab.removeBuddy(bI);
	}

}
