

package TTD_and_Junit_TESTING;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_Demo_Testing {
Junit_Demo_Example obj=new Junit_Demo_Example();
	@Test
	public void test() {
		assertEquals(obj.To_Remove_A("ABCD"),"BCD");
		assertEquals(obj.To_Remove_A("AACD"),"CD");
		assertEquals(obj.To_Remove_A("BACD"),"BCD");
		assertEquals(obj.To_Remove_A("BBAA"),"BBAA");
	    assertEquals(obj.To_Remove_A("AABAA"),"BAA");
	}

}
