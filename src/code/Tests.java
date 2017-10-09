package code;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests extends Methods{
	@BeforeTest
	public void setupbrowser()
	{
		setupff();
		//setupffheadless();
		
	}
  @Test
  public void test1() 
  {
	  login();
	  verifytitle();
  }
  @AfterTest
  public void closebrowser()
  {
	  closeff();
  }
}
