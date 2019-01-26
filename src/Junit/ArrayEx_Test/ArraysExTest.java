package ArrayEx_Test;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class ArraysExTest {

	@Test
	void testReorderArray() {
		String[] myArray1 = {"Joe", null, null, "Fred"};
		String[] expectedArray1 = {"Joe", "Fred", null, null};
		Assert.assertArrayEquals(expectedArray1,ArrayEx.ArraysEx.reorderArray(myArray1));
		String[] myArray2 = {null, "Joe", null, "Fred"};
		String[] expectedArray2 = {"Joe", "Fred", null, null};
		Assert.assertArrayEquals(expectedArray2,ArrayEx.ArraysEx.reorderArray(myArray2));
		String[] myArray3 = {null, null, null, "Fred"};
		String[] expectedArray3 = {"Fred", null, null, null};
		Assert.assertArrayEquals(expectedArray3,ArrayEx.ArraysEx.reorderArray(myArray3));
	}

}
