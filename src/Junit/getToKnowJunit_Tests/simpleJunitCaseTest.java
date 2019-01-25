package getToKnowJunit_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class simpleJunitCaseTest {
	@Test
	void testFindMax() {
		assertEquals(4,getToKnowJunit.simpleJunitCase.findMax(new int[]{1,3,4,2}));  
	    assertEquals(-1,getToKnowJunit.simpleJunitCase.findMax(new int[]{-12,-1,-3,-4,-2}));  
	}
}
