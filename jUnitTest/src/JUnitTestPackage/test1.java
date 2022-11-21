package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class test1 {

	@Test
	public void test() {
		JUnitTestFunctions j = new JUnitTestFunctions();
		String t = j.Concatenate("Naman", "Taneja");
		assertEquals("NamanTaneja", t);
	}

}
