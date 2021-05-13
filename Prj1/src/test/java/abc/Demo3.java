package abc;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
 @Test
 public void testA()
 {
	 Reporter.log("testA",true);
	 Reporter.log("testA2",true);
 }
}
