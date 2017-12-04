package ua.nure.HalenaVasylenko;

import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	@Test
      public void testFullName (){
	User user = new User ();
	user.setFirstName("Halyna");
	user.setLastName("Vasylenko");
	String fullName = user.getFullName ();
	assertEquals("Halyna Vasylenko", fullName);
	}
}
