package Mockitodemoo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class simpleMockitoClass {

	 @Test
	   
	 public void listingObjects(){
	 
		 List mocklist=mock(List.class);
	     
		 when(mocklist.size()).thenReturn(1);
	     
		 Assert.assertEquals(1,mocklist.size());
	     
		 System.out.println(mocklist.size());
	     
		 System.out.println(mocklist);
		 
	    }
}