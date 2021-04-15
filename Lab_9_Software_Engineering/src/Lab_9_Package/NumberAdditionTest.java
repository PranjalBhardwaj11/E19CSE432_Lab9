package Lab_9_Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberAdditionTest {

	@Test
	public void test() {
		jUnit_Main temp = new jUnit_Main();
		int flag = temp.NumberAddition(2, 8);
		assertEquals(10,flag);
	}

}
