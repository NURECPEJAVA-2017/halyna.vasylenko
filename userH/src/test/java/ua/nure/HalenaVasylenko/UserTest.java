package ua.nure.HalenaVasylenko;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	private static final int ETALONE_AGE = 2018 - 1984;
	private User user;
	private Date dateOfBirthd;
	
	protected void setUp () throws Exception {
		super.setUp ();
		user = new User ();
		
		Calendar calendar = Calendar.getInstance ();
		calendar.set(1984, Calendar.MAY, 26);
		dateOfBirthd = calendar.getTime ();
		
	}
	@Test
	public void testGetAge () {
		user.setDateOfBirth (dateOfBirthd);
		assertEquals (ETALONE_AGE, user.getAge());
		
	}
	@Test
	public void testFullName() {
		User user = new User();
		user.setFirstName("Halyna");
		user.setLastName("Vasylenko");
		String fullName = user.getFullName();
		assertEquals("Halyna Vasylenko", fullName);
	}
}
