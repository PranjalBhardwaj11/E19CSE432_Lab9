package Lab_9_Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringConcatenationTest {

	@Test
	public void test() {
		jUnit_Main flag = new jUnit_Main();
		String temp = flag.StringConcatenation("Pranjal", "Bhardwaj");
		assertEquals("PranjalBhardwaj",temp);
	}

}
