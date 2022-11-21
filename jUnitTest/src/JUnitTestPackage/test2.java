package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test2 {

	@Test
	public void test() {
		JUnitTestFunctions j = new JUnitTestFunctions();
		int t = j.AddNumbers(12, 13);
		assertEquals(25,t);
			
				}
	}

