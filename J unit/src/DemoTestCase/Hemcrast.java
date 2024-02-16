package DemoTestCase;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class Hemcrast {

	 @Test
	 
	 public void testEmailID(){  // JUnit Test case
	        String email="bhosaleajinkya77@gmail.com";
	        Assert.assertTrue(email.contains("@"));
	    }
	    
	 @Test
	    public void testEmailIDHamcrest(){  						//Hamcrest Test case
	        String email="bhosaleajinkya1998@gmail.com";
	        Assert.assertThat(email, StringContains.containsString("gmail.com"));
	    
	    }
}
