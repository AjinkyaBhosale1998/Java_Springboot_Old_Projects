package DemoTestCase;

import org.junit.Assert;
import org.junit.Test;


public class factTestCase {
	
	@Test
	public void TestFact()
	{
		
		int fact=120;
		fact f= new fact();
		int re=f.fact(5);
		Assert.assertEquals(fact, re);
		
	}
	

}
