
import java.util.ArrayList;;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook()
	{
		buddies = new ArrayList<>();
	}
	
	public void addBuddy(BuddyInfo bi)
	{
		buddies.add(bi);
	}
	
	public void removeBuddy(BuddyInfo bi) 
	{
		buddies.remove(bi);	
	}
	
	public int size()
	{
		return buddies.size();
	}
	
	public void clear()
	{
		buddies.clear();
	}
}
