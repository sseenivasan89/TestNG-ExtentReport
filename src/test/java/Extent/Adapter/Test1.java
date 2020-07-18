package Extent.Adapter;

import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Test1 {

	@org.testng.annotations.Test (priority = 1)
	public void Test1_1() {
		Assert.assertTrue(true);
	}
	@org.testng.annotations.Test (priority = 2)
	public void Test1_2() {
		Assert.assertTrue(false);
	}
	
	
	
}
