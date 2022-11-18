package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit = new JUnitFunction();
		int result = junit.addNumbers(52, 38);
		assertEquals(90, result);
	}

}
