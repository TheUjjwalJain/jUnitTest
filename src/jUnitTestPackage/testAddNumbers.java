package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTestFunctions junitstring = new jUnitTestFunctions();
		String result = junitstring.addstrings("capstone","project");
		assertEquals("capstoneproject", result);
	}
}
