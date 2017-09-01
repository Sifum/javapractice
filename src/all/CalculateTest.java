package all;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	
	@Test
	public void testAdd() {
		Calculate cal = new Calculate();
		int val = cal.add(2, 3);
		assertEquals(5, val);
	}
}
