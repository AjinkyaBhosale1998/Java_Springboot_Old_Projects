import org.junit.Assert;
import org.junit.Test;

public class TestCase {
	
	 @Test
	 
	    public void addtionTest(){
	 
		 int x=30;
	        int y=20;
	        int result=50;
	     
	        calculator calculator = new calculator();
	        
	        int finalResult=calculator.addition(x,y);
	        
	        Assert.assertEquals(result, finalResult);
	    }
	 
	 @Test
	 
	    public void substractionTest(){
	 
		 int x=30;
	        int y=20;
	        int result=10;
	     
	        calculator calculator = new calculator();
	        
	        int finalResult=calculator.subtraction(x,y);
	        
	        Assert.assertEquals(result, finalResult);
	    }
	 
	 @Test
	 
	 public void MultiplicationTest(){
		 
		 int x=3;
	        int y=2;
	        int result=6;
	     
	        calculator calculator = new calculator();
	        
	        int finalResult=calculator.multipilication(x,y);
	        
	        Assert.assertEquals(result, finalResult);
	    }
	 
	 @Test
	 
	 public void DivisionTest(){
		 
		 int x=20;
	        int y=10;
	        int result=2;
	     
	        calculator calculator = new calculator();
	        
	        int finalResult=calculator.division(x,y);
	        
	        Assert.assertEquals(result, finalResult);
	    }

}
