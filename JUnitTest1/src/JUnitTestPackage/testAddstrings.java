package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddstrings {
	
	@Test
	public void test() {
		JUnitFunction junitstrings = new JUnitFunction();
		String result = junitstrings.addStrings("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
