import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuddyInfoTest {

	BuddyInfo b = null;
	
	@Before
	public void setUp() throws Exception 
	{
		b = new BuddyInfo("Alex", 20);
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testBuddyInfoBuddyInfo() 
	{
		BuddyInfo b2 = new BuddyInfo(b);
		assertEquals("The two buddyInfos should be identical", b, b2);
	}

	@Test
	public void testGetGreeting() 
	{
		assertEquals("The greeting should be Hey Buddy!", "Hey Buddy!", b.getGreeting());
	}

	@Test
	public void testGetAge() 
	{
		assertEquals("Age should return 20.", 20, b.getAge());
	}

	@Test
	public void testSetAge() 
	{
		b.setAge(21);
		assertEquals("Age should return 21.", 21, b.getAge());
	}

	@Test
	public void testIsOver18() 
	{
		assertTrue("Age should be over 18.", b.isOver18());
	}

}
