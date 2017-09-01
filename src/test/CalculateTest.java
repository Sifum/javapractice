package test;

import static org.junit.Assert.*;
import org.junit.Test;
import all.Calculate;

public class CalculateTest {
	
	@Test
	public void testAdd() {
		Calculate cal = new Calculate();
		int val = cal.add(5, 3);
		assertEquals(6, val);
	}
}
