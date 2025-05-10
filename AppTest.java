package pallavi_115;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	public void testLogin2()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc","abc@123"));
	}

	public void testLogin()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc","abc123"));
	}

}
