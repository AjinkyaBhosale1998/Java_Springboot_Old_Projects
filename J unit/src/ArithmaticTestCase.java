import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmaticTestCase {
	
	public ArithmaticTestCase() { }

	@Test

	public void testFindSquareroot() {

	Arithmatic instance = new Arithmatic();

	double expResult = 2.5;

	double result = instance.findSquareroot(6.25);   
	
	assertEquals("findSquareroot",expResult, result, 0.0);

	}

}
