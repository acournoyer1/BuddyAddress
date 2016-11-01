import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {

	AddressBook a = null;
	BuddyInfo b = null;
	
	@Before
	public void setUp() throws Exception 
	{
		a = new AddressBook();
		b = new BuddyInfo("Alex", 20);
		a.addBuddy(b);
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testSize() {
		assertEquals("Size of a one item list should be 1.", 1, a.size());
	}

	@Test
	public void testClear() {
		a.clear();
		assertEquals("Size of a one item list should be 0.", 0, a.size());
	}

}
