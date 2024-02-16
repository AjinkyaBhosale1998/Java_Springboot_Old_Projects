import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCasee {
	
	int x=0;
    int y=0;
    int result=0;
    calculator calculator =null;

    @Before
    public void setup()
    {
         x=30;
         y=20;
        result=50;
        calculator =new calculator();
    }
    
    
    @Test
    public void addtionTest()
    {
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
    }
    
    
    @Test
    public void subtractionTest()
    {
        x=30;
        y=20;
        result=10;
        int finalResult=calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);
    }
}